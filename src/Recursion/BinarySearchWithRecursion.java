package Recursion;

import java.util.Arrays;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 2, 100, 50, 75, 12, 89, 51, 36, 28, 99};
        Arrays.sort(arr);
        System.out.println(search(arr, 50, 0, arr.length));
    }

    public static boolean search(int[] arr, int target, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return false;

        int mid = startIndex + endIndex / 2;
        if (arr[mid] == target)
            return true;
        else if (arr[mid] > target)
            startIndex = mid;
        else
            endIndex = mid;

        return search(arr, target, startIndex, endIndex);
    }
}
