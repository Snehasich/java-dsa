public class Practs {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 18, 14, 9, 4};

        System.out.println(search(arr, 14));
    }

    static String search(int[] arr, int target) {
        int ans = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
//            int left = i - 1;
//            int right = i + 1;

            if(i == 0 || i == arr.length-1) continue;

//            if(arr[left] > arr[i]) {
//                ans = arr[left];
//                idx = left;
//                break;
//            }
//
//            if(arr[right] < arr[i]) {
//                ans = arr[i];
//                idx = i;
//                break;
//            }

            if(arr[i] == target) {
                idx = i;
                ans = arr[i];
            }
        }

        return "ans : " + ans + ", and index : " + idx;
    }
}
