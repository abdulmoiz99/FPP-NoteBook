package Recursion;

public class StringLengthWithRecursion {
    public static void main(String[] args) {
        System.out.println(LengthOfString("Hello"));
        System.out.println(LengthOfString(""));
    }
    public static int LengthOfString(String str)
    {
        if(str == null || str.isEmpty()) return 0;
        else
        {
            return 1 + LengthOfString(str.substring(1));
        }
    }
}
