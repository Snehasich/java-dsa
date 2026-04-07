package VTP_technical;

// find the first srudent who scored above the cutOff marks using binary search
class findCutOff {

    public static void main(String[] args) {
        int[] marks = { 45, 67, 89, 23, 56, 78, 90, 34 };
        int cutOff = 50;

        java.util.Arrays.sort(marks);
        for(int i= 0;i<marks.length;i++){
            System.out.print(marks[i]+"");
        }
        int resultIndex = binaryAboveCutOff(marks, cutOff);
        if (resultIndex != -1) {
            System.out.println("The first student scored above is: " + marks[resultIndex]);
        } else {
            System.out.println("No student scored above");
        }
        System.out.println();

    }

    public static int binaryAboveCutOff(int[] arr, int cutOff) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > cutOff) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}