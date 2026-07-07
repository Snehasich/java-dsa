package VTP_technical.Day7;

public class Remove_Covered_Intervals_1288 {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 4},
                {3, 6},
                {2, 8}
        };

        System.out.println(removeCoveredIntervals(intervals));
    }

    static int removeCoveredIntervals(int[][] intervals) {

        int covered = 0;

        for (int i = 0; i < intervals.length; i++) {
            boolean isCovered = false;

            for (int j = 0; j < intervals.length; j++) {
                if (i == j) continue;
                if (intervals[j][0] <= intervals[i][0] &&
                        intervals[j][1] >= intervals[i][1]) {
                    isCovered = true;
                    break;
                }
            }

            if (isCovered) {
                covered++;
            }
        }

        return intervals.length - covered;
    }
}