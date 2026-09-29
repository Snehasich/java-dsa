package companies.ibm;

// Given a list of packet sizes, combine each packet with the leftover from the previous packet.
// From the total, create the largest possible packet whose size is a power of 2.
// Carry the remaining amount to the next packet.
// Return the largest repackaged packet.

// Input: [10, 5, 21] → Output: 16


import java.util.*;

public class Longest_Repackaged {
    public static void main(String[] args) {
        List<Integer> packets = Arrays.asList(10, 5, 21);
        long result = find(packets);
        System.out.println("Maximum repackaged packet: " + result);
    }

    static long find(List<Integer> list){
        long rem = 0;
        long max = 0;

        for(int i : list){
            long total = i+rem;
            long pow = 1;
            for(int j=1;j<=total;j*=2){
                pow = j;
                if(j>total/2)break;
            }
            rem = total-pow;
            max = Math.max(max, pow);
        }

        return max;
    }
}
