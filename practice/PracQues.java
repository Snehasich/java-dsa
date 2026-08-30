public class PracQues {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(print(num));
    }

    static int sum = 0;
    static int print(int num){
        if(num == 0){
            return -1;
        }

        sum = sum + num;
        print(num-1);
        return sum;
    }
}