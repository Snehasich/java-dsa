package Top_75_Leetcode.Stacks;

// https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: asteroids = [5,10,-5]
//Output: [5,10]
//Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

//Example 2:
//Input: asteroids = [8,-8]
//Output: []
//Explanation: The 8 and -8 collide exploding each other.

//Example 3:
//Input: asteroids = [10,2,-5]
//Output: [10]
//Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.


import java.util.*;

public class Asteroid_Collision_735 {
    public static void main(String[] args) {
        int[] asteroids = {10, 2, -5};

        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    static int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {

            boolean alive = true;

            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peekLast() > 0) {
                if (stack.peekLast() < -asteroid) {
                    // Top asteroid is smaller, so it explodes.
                    stack.pollLast();
                } else if (stack.peekLast() == -asteroid) {
                    // Both asteroids are the same size.
                    stack.pollLast();
                    alive = false;
                } else {
                    // Current asteroid explodes.
                    alive = false;
                }
            }

            if (alive) {
                stack.offerLast(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        int index = 0;

        for (int asteroid : stack) {
            result[index++] = asteroid;
        }

        return result;
    }
}
