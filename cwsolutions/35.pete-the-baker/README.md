# Codewars: Pete, the Baker

A clean and optimal Java solution for the "Pete, the baker" challenge on Codewars, featuring both imperative Map loops and functional Java Streams approaches.

## Problem Description

Pete likes to bake some cakes. He has some recipes and ingredients. Unfortunately, he is not good at math. Help him find out how many cakes he can bake considering his recipes and available ingredients.

Write a function `cakes()`, which takes the recipe (`Map<String, Integer>`) and the available ingredients (`Map<String, Integer>`) and returns the maximum number of cakes Pete can bake (as an integer). For simplicity, there are no units for the amounts (e.g., 1 lb of flour or 200 g of sugar are simply 1 or 200). Ingredients that are not present in the objects can be considered as 0.

### Examples:
* `cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200})` ➔ **`2`**
* `cakes({apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100}, {sugar: 500, flour: 2000, milk: 2000})` ➔ **`0`**

* **Platform:** Codewars
* **Difficulty:** 5 kyu
* **Topics:** Fundamentals, Maps, Data Structures, Algorithms, Streams

---

## Logic & Strategy

To calculate the maximum number of cakes Pete can bake:
1. **Recipe Iteration:** Loop through every ingredient required in the `recipe` map.
2. **Availability Check & Defaulting:** Check if the required ingredient exists in the `available` map. If missing, treat its available quantity as `0`.
3. **Bottleneck Calculation (Limiting Factor):**
   - For each ingredient, calculate how many times the recipe portion can be made using integer division: $\text{available} / \text{required}$.
   - The overall maximum number of cakes is dictated by the **minimum** factor among all required ingredients (the bottleneck).
4. **Early Exit Optimization:** If any required ingredient is missing or insufficient (yielding `0`), return `0` immediately.

---

## Complexity Analysis

* **Time Complexity:** $\mathcal{O}(N)$ — Where $N$ is the number of distinct ingredients in the `recipe` map. We perform a single pass over the recipe entries.
* **Space Complexity:** $\mathcal{O}(1)$ — The algorithm operates in auxiliary constant space without creating additional dynamic collections.

---

## Alternative Approaches

### Solution 1: Imperative EntrySet Iteration (Optimal & Readable)
Using an imperative loop with `Map.Entry` and `Math.min()` to find the bottleneck ingredient:

```java
import java.util.Map;

public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakes = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            String ingredient = entry.getKey();
            int requiredAmount = entry.getValue();

            // Default missing ingredients to 0
            int availableAmount = available.getOrDefault(ingredient, 0);

            // Calculate integer division for possible portions
            int possibleCakes = availableAmount / requiredAmount;

            // Track the minimum bottleneck
            maxCakes = Math.min(maxCakes, possibleCakes);

            // Early exit if any ingredient cannot satisfy even 1 cake
            if (maxCakes == 0) {
                return 0;
            }
        }

        return maxCakes;
    }
}
```
### Solution 2: Functional Java Streams (Concise)
Using Java Stream API to map recipe keys to possible ratios and find the minimum:

```java
import java.util.Map;

public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        return recipe.keySet()
                     .stream()
                     .mapToInt(ingredient -> available.getOrDefault(ingredient, 0) / recipe.get(ingredient))
                     .min()
                     .orElse(0);
    }
}
```

### Solution 3: KeySet Loop with Explicit Key Checking
Using keySet() and containsKey() checks explicitly:

```java
import java.util.Map;

public class PeteBaker {

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int maxCakes = Integer.MAX_VALUE;

        for (String ingredient : recipe.keySet()) {
            if (!available.containsKey(ingredient)) {
                return 0;
            }

            int count = available.get(ingredient) / recipe.get(ingredient);
            if (count < maxCakes) {
                maxCakes = count;
            }
        }

        return maxCakes == Integer.MAX_VALUE ? 0 : maxCakes;
    }
}
```