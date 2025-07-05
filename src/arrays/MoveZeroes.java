package arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroesToEnd(nums);

        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }

    public static void moveZeroesToEnd(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                // Swap non-zero with slow pointer
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                slow++;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}