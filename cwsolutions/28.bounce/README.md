# Codewars: Bouncing Balls

A clean and optimal Java solution for the "Bouncing Balls" challenge on Codewars, featuring both iterative simulation and constant-time mathematical approaches.

## Problem Description

A child plays with a ball on the $n$-th floor of a tall building. The height of this floor above ground level is $h$.

He drops the ball out of the window. The ball bounces (for example, to two-thirds of its height) and the mother looks out of a window that is at height $window$ from the ground.

How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing)?

### Requirements for a Valid Experiment:
- $h > 0$
- $0 < \text{bounce} < 1$
- $\text{window} < h$

If all three conditions above are fulfilled, return a positive integer; otherwise, return `-1`.

### Examples:
* `h = 3.0, bounce = 0.66, window = 1.5` ➔ Output: **`3`**
* `h = 3.0, bounce = 1.0, window = 1.5` ➔ Output: **`-1`** (invalid `bounce`)
* `h = 30.0, bounce = 0.66, window = 1.5` ➔ Output: **`15`**

* **Platform:** Codewars
* **Difficulty:** 6 kyu
* **Topics:** Fundamentals, Mathematics, Simulation, Loops

---

## Logic & Algorithm

1. **Validation Check:** Verify that $h > 0$, $0 < \text{bounce} < 1$, and $\text{window} < h$. If any condition fails, immediately return `-1`.
2. **Initial Drop:** As the ball is dropped from height $h$, it passes the window once on its way down. Initialize `count = 1`.
3. **Bouncing Loop:** Calculate the new bounce height: $h = h \times \text{bounce}$.
   - As long as the new height exceeds the window level ($h > \text{window}$), the ball passes the window twice (once going up, once coming down).
   - Add `2` to `count` for each valid bounce.
4. **Termination:** When the bounce height falls to or below the window level, return the accumulated `count`.

---

## Complexity Analysis

### Iterative Simulation Approach
* **Time Complexity:** $\mathcal{O}(\log_{\text{bounce}}(\frac{\text{window}}{h}))$ — The ball height shrinks geometrically, so the loop runs in logarithmic time proportional to the number of visible bounces.
* **Space Complexity:** $\mathcal{O}(1)$ — Operates with a few primitive double/integer variables in constant space.

---

