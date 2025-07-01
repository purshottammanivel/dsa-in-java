package arrays;

public class FindMaxElement {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        int max = findMax(numbers);

        System.out.println("Maximum element in array: " + max);
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = arr[0]; // assuming first element is max

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // updating the max if current is bigger
            }
        }

        return max;
    }
}