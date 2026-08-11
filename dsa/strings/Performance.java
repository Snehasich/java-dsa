package strings;

public class Performance {
    public static void main(String[] args) {
        // here it taking more memory space  O(N^2)
        // to optimize we can use StringBuilder to take less memory space
        String series = "";
        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i); // print from a to z
            series += ch; // here it add all character together
        }

        System.out.println(series);
    }
}
