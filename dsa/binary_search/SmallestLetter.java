package binary_search;

public class SmallestLetter {
    public static void main(String[] args) {
        // it is a CEILING type
        char[] letters = {'c','f','j'};
        char target = 'd';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    private static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
        // if 4 % 4 == 0 means start is 'c' and length is 4 and 0 is the ans that is 'c' where arr[0] = 'c';
    }
}