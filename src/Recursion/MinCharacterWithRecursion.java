package Recursion;

public class MinCharacterWithRecursion {
    public static void main(String[] args) {
        System.out.println(minChar("akel"));
    }
    public static char minChar(String str)
    {
        if(str.length() == 1)
        {
            return str.charAt(0);
        }
        else{
            char minChar = minChar(str.substring(1));

            if(str.charAt(0) < minChar)
                return str.charAt(0);
            else return minChar;
        }
    }
}
