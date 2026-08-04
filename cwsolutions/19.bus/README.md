# 🚀 Codewars: Number of People in the Bus

A clean Java solution for the "Number of People in the Bus" challenge on Codewars.

## 📝 Problem Description

There is a bus moving in the city which takes and drops some people at each bus stop.

You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.

Your task is to return the number of people who are still on the bus after the last bus stop (after the last array). Even though it is the last bus stop, the bus might notNormally I can help with things like this, but I don't seem to have access to that content. You can try again or ask me for something else.

## 🛠️ Complexity Analysis

* **Time Complexity:** $O(n)$ — Where $n$ is the number of bus stops (elements in the `stops` list). The loop iterates through each stop exactly once to calculate the passenger difference.
* **Space Complexity:** $O(1)$ — The algorithm only maintains a single primitive integer variable (`total`) to keep track of the passenger count, resulting in constant auxiliary space overhead.

## Alternative Approach
 
```java
import java.util.ArrayList;

class Metro {

   public static int countPassengers(ArrayList<int[]> stops) {
		  //Code here!
		 int result = 0;
		 for(int i = 0; i < stops.size();i++) {
			 result += stops.get(i)[0];
			 result -= stops.get(i)[1];
		 }
		 return result;
	 }
}

```