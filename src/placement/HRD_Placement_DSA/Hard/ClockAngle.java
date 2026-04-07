package placement.HRD_Placement_DSA.Hard;

// Input: s = "06:00"
//Output: 180.000
//Explanation: When the time is 06:00, the angle between the hour and minute hands of the clock is 180.000 degrees.
//
//Input: s = "03:15"
//Output: 7.500
//Explanation: When the time is 03:15, the angle between the hour and minute hands of the clock is 7.500 degrees.
//
//Input: s = "00:00"
//Output: 0.000
//Explanation: When the time is 00:00, the angle between the hour and minute hands of the clock is 0.000 degrees.

public class ClockAngle {
    public static void main(String[] args) {
        String s = "01:50";

        clock(s);
    }

    static void clock(String s) {

        int hr = Integer.parseInt(s.substring(0,2));
        int min = Integer.parseInt(s.substring(3,5));

        System.out.println("hr : " + hr);
        System.out.println("min : " + min);

        //   1 hr -> 30 degree
        //   60 min -> 360 degree

        double MinAngle = 6 * min;
//        double HrAngle = (30 * MinAngle) / 360 + (hr * 30);
        double HrAngle = (0.5 * min) + (hr * 30);

        double angle = Math.abs(HrAngle - MinAngle);
        angle = Math.min(angle, 360 - angle);

        System.out.println(angle);
    }
}
