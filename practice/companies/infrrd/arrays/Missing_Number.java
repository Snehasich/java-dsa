package companies.infrrd.arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        System.out.println(missingnum(arr));
    }

    static int missingnum(int[] arr){
        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] - 1 != i) continue;
            ans[arr[i] - 1] = 1;
        }

        for(int i = 0; i < arr.length; i++){
            if(ans[i] == 0) return i+1;
        }

        return -1;
    }
}
