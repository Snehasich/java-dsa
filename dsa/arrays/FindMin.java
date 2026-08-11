package arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,54,34,23,21,2,3,45,67,90};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int temp = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
