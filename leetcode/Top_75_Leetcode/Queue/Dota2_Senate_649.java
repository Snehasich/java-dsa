package Top_75_Leetcode.Queue;

// https://leetcode.com/problems/dota2-senate/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:
//Input: senate = "RD"
//Output: "Radiant"
//Explanation:
//The first senator comes from Radiant and he can just ban the next senator's right in round 1.
//And the second senator can't exercise any rights anymore since his right has been banned.
//And in round 2, the first senator can just announce the victory since he is the only guy in the senate who can vote.

//Example 2:
//Input: senate = "RDD"
//Output: "Dire"
//Explanation:
//The first senator comes from Radiant and he can just ban the next senator's right in round 1.
//And the second senator can't exercise any rights anymore since his right has been banned.
//And the third senator comes from Dire and he can ban the first senator's right in round 1.
//And in round 2, the third senator can just announce the victory since he is the only guy in the senate who can vote.


import java.util.*;

public class Dota2_Senate_649 {
    public static void main(String[] args) {
        String senate = "RDD";

        System.out.println(predictPartyVictory(senate));
    }

    static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();

        // Store the indices
        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }


        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.poll();
            int d = dire.poll();

            if(r < d){
                radiant.offer(r + senate.length());
            } else {
                dire.offer(d + senate.length());
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
