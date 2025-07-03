package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }

    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers inward
            start++;
            end--;
        }
    }
}