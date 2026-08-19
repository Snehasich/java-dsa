package companies.infrrd.arrays;

public class Largest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        largest(arr);
    }

    static void largest(int[] arr){
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
