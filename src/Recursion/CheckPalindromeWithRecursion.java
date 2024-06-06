package Recursion;

public class CheckPalindromeWithRecursion {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(1212));
    }

    public static boolean checkPalindrome(int input) {
        return isPalindrome(Integer.toString(input), 0);
    }

    public static boolean isPalindrome(String input, int startIndex) {
        if (startIndex >= input.length()) {
            return true;
        }

       else if (input.charAt(startIndex) == input.charAt(input.length() - (startIndex + 1)))
            return isPalindrome(input, startIndex + 1);
       else return false;
    }
}