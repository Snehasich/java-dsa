package VTP_technical.Day2;

//  IMP for companies questions

public class CheckForStringRotation {

    public static void main(String[] args) {
        String originalString = "apple";

        String str2 = "pplea";   // true
        String str3 = "eappl";   // true
        String str4 = "pplae";   // false

        String temp = originalString + originalString;

        System.out.println(temp.contains(str4) ? "True" : "False");

    }
}
