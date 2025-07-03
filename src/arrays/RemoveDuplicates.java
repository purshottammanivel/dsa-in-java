package arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 3, 4};

        int length = removeDuplicates(numbers);

        System.out.println("New length after removing duplicates: " + length);
        System.out.print("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast]; // Move unique value to correct position
            }
        }

        return slow + 1;
    }
}