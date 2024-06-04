package Recursion;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        System.out.println(LinearSearchWithRecursion(new int[]{1, 2, 3, 4, 5, 6}, 6, 0));
    }

    public static int LinearSearchWithRecursion(int[] arr, int target, int startPos) {
        if (startPos == arr.length) return -1; // target not found

        if (arr[startPos] == target) return startPos;

        else {
            return LinearSearchWithRecursion(arr, target, startPos + 1);
        }
    }
}
