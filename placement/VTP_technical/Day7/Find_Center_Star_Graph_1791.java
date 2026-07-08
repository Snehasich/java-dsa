package VTP_technical.Day7;

public class Find_Center_Star_Graph_1791 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,3},
                {4,2}
        };

        System.out.println(findCenter(arr));
    }

    static int findCenter(int[][] edges) {
        int[] e1 = edges[0];
        int[] e2 = edges[1];

        return e1[0] ==  e2[0] || e1[0] == e2[1] ? e1[0] : e1[1];
    }

}
