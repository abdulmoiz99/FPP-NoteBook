package Recursion;

import java.util.Arrays;

public class ReverseArrayWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13, 11};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArray(arr, 0)));
    }

    public static int[] reverseArray(int[] arr, int startIndex) {
        if (startIndex >= arr.length / 2) return arr;

        arr = reverseArray(arr, startIndex + 1);

        int temp = arr[startIndex];
        arr[startIndex] = arr[arr.length - (startIndex + 1)];
        arr[arr.length - (startIndex + 1)] =  temp;
        return arr;
    }
}