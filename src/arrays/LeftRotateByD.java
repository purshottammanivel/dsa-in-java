package arrays;

import java.util.Arrays;

public class LeftRotateByD {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        rotateLeftByD(arr, d);

        System.out.println("After left rotation by " + d + ": " + Arrays.toString(arr));
    }

    public static void rotateLeftByD(int[] arr, int d) {
        if (arr == null || arr.length == 0 || d <= 0) return;

        int n = arr.length;
        d = d % n; // handle d > n

        // Step 1. Reverse first d
        reverse(arr, 0, d - 1);

        // Step 2. Reverse remaining n-d
        reverse(arr, d, n - 1);

        // Step 3. Reverse entire array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}