package arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 3};

        int target = 9;
        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}