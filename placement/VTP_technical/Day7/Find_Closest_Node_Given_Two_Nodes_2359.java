package VTP_technical.Day7;

import java.util.*;

public class Find_Closest_Node_Given_Two_Nodes_2359 {
    public static void main(String[] args) {
        int[] edges = {2,2,3,-1};
        int node1 = 0, node2 = 1;

        System.out.println(closestMeetingNode(edges, node1, node2));
    }

    static int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] dist1 = getDistance(edges, node1);
        int[] dist2 = getDistance(edges, node2);

        int answer = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < edges.length; i++) {

            if (dist1[i] != -1 && dist2[i] != -1) {

                int maxDist = Math.max(dist1[i], dist2[i]);

                if (maxDist < min) {
                    min = maxDist;
                    answer = i;
                }
            }
        }

        return answer;
    }

    static int[] getDistance(int[] edges, int start) {

        int[] dist = new int[edges.length];
        Arrays.fill(dist, -1);

        int d = 0;

        while (start != -1 && dist[start] == -1) {

            dist[start] = d;
            d++;

            start = edges[start];
        }

        return dist;
    }
}