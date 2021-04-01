package DP;
//Used for find gcd of two number with more efficient way
// this algo is faster than the recursive method

public class EuclideanALgo {
    public static int gcd(int a, int b){
        int divisor = a <= b ? a : b;
        int dividend = a >= b ? a : b;

        while (divisor!=0){
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }

        return dividend;
    }

    public static void main(String[] args) {
      int result =  gcd(10,14);
        System.out.println(result);
    }
}
