package Recursion;

public class ReverseStringWithRecursion {
    public static void main(String[] args) {
        printReverseStringChar("12345");
    }
    public static void printReverseStringChar(String str)
    {
        if(str == null || str.length() == 0)
            return;

        else
        {
            printReverseStringChar(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}
