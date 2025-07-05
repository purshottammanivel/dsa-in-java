package arrays;

import java.util.Arrays;

public class LeftRotateByOne {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        rotateLeftByOne(arr);

        System.out.println("After left rotation: " + Arrays.toString(arr));
    }

    public static void rotateLeftByOne(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int first = arr[0];

        // Shift elements one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place first element at the end
        arr[arr.length - 1] = first;
    }
}