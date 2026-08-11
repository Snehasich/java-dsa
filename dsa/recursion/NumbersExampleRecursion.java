package recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //Recursion works on STACK

        // Why RECURSION
        // It helps us in solving bigger/complex problems in easier way
        // you can convert recursion soln into iteration and vice versa to get more optimized way
        // space complexity is not constant because of recursive calls

        print(1);
    }

    static void print(int n) {
        System.out.println(n);
        if(n == 5)      // base condition -> condition where our recursion will stop making new calls
            return;
        print(n+1);     // recursive call
        // this is called tail recursion
        // this is the last function call


        // if you are calling function again and again then you can treat it as other function in a stack
        // so seperate memory takes for all function call

        // if you dont use base condition then the memory of computer will exceed the limit (STACK OVERFLOW ERROR)
    }
}
