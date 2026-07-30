package Top_75_Leetcode;

// https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input
//["RecentCounter", "ping", "ping", "ping", "ping"]
//[[], [1], [100], [3001], [3002]]
//Output
//[null, 1, 2, 3, 3]
//Explanation
//RecentCounter recentCounter = new RecentCounter();
//recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
//recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
//recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
//recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3



import java.util.*;

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);

        while(!queue.isEmpty() && queue.peek() < t-3000) {
            queue.poll();
        }

        return queue.size();
    }
}

public class No_Recent_Calls_933 {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        System.out.println(counter.ping(1));      // 1
        System.out.println(counter.ping(100));    // 2
        System.out.println(counter.ping(3001));   // 3
        System.out.println(counter.ping(3002));   // 3
    }
}