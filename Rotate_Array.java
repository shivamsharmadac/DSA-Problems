import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 5, 6, 2 }; // Example input
        int n = arr.length;
        int d = 7; // Number of positions to rotate left

        rotateLeft(arr, n, d);
        System.out.println(Arrays.toString(arr)); // Output the rotated array
    }

    public static void rotateLeft(int[] arr, int n, int d) {
        // Validation
        if (arr == null || n == 0) {
            System.out.println("Array is empty or null. No rotation performed.");
            return;
        }

        // Normalize d to be within bounds (0 ≤ d < n)
        d = d % n; // If d > n, reduce it
        if (d < 0) {
            d += n; // Convert negative rotations to equivalent positive rotations
        }

        // Perform rotation using the reversal algorithm
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

// Time complexity:O(N)
// Space Complexity:O(1)