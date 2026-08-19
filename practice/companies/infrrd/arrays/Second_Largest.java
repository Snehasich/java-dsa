package companies.infrrd.arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        secondlargest(arr);
    }

    static void secondlargest(int[] arr){
        int max = 0;
        int secondMax = 0;

        // find max
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // find second max
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }


        System.out.println(secondMax);
    }
}
