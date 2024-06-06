package Recursion;

public class MaxValueFromArray {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{5, -3, 6, 1, 9, 4}, 0));
    }
    public static int maxValue(int[] arr, int startIndex){
        if(startIndex >= arr.length) return arr[0];

        int maxValue = maxValue(arr, startIndex+1);

        if(arr[startIndex] > maxValue) return arr[startIndex];
        else return maxValue;
    }
}
