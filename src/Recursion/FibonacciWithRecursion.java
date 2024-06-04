package Recursion;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(5));
    }

    public static int fibonacciRecursion(int n) {
        if (n == 0 || n == 1) return n;

        else {
            System.out.println(n);
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
}
