package VTP_technical;

public class DataTypes {
    public static void main(String[] args) {

        byte b = 123;
        short s = 12345;
        int i = 1234567890;
        long l = 1232432413123231l;             // 64 bits
        float f = 4.34f;
        double d = 4.324234;
        char c = 'A';

        System.out.println(l);
        System.out.println((char) i);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}