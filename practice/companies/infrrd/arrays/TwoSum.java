package companies.infrrd.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        int target = 3;

        twosum(arr, target);
    }

    static void twosum(int[] arr,int target) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    System.out.println(i + " " +  j);
                    break;
                }
            }
        }
    }
}
