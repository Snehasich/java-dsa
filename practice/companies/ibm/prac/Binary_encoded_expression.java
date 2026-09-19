package companies.ibm.prac;

public class Binary_encoded_expression {

    public static void main(String[] args) {

        String binary = "011000100000110100100000";

        System.out.println(solve(binary));
    }

    static int solve(String binary) {

        int num1 = 0;
        int num2 = 0;
        char operator = ' ';

        for (int i = 0; i < binary.length(); i += 4) {

            // convert binary to decimal, using this 2, eg : 0110 → 6
            int value = Integer.parseInt(
                    binary.substring(i, i + 4), 2
            );

            if (value <= 9) {   // decimal 0 to 9
                if (operator == ' ') {
                    num1 = num1 * 10 + value;
                } else {
                    num2 = num2 * 10 + value;
                }
            } else {
                if (value == 10) operator = '+';
                if (value == 11) operator = '-';
                if (value == 12) operator = '*';
                if (value == 13) operator = '/';
            }
        }

        if (operator == '+') return num1 + num2;
        if (operator == '-') return num1 - num2;
        if (operator == '*') return num1 * num2;
        if (operator == '/') return num1 / num2;

        return -1;
    }
}