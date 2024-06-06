package Recursion;

public class PowerCalculatorWithRecursion {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int n, int p) {
        if (p <= 0) return 1;

        return n * power(n, p - 1);
    }
}
