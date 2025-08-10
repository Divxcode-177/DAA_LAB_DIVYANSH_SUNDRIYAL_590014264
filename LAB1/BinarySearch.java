package LAB1;
import java.util.*;
public class BinarySearch{

    // Binary Search implementation
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    // Measure execution time for one search
    public static double measureExecutionTime(int[] arr, int target) {
        long startTime = System.nanoTime();

        binarySearch(arr, target);

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    public static void main(String[] args) {
        // Test arrays
        int[] emptyArray = {}; // Empty array
        int[] singleElement = {5}; // Single element
        int[] negativeValues = {-5, -3, 0, 2, 4, 6, 8}; // Negative values
        int[] duplicates = {1, 1, 1, 1, 1, 1, 1}; // Duplicates
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }

        System.out.println("Execution Times (milliseconds):");

        // --- 5 Best Case ---
        System.out.println("Best Case 1: " + measureExecutionTime(largeArray, largeArray[500]));
        System.out.println("Best Case 2: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 500), 250));
        System.out.println("Best Case 3: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 200), 100));
        System.out.println("Best Case 4: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 50), 25));
        System.out.println("Best Case 5: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 10), 5));

        // --- 5 Worst Case ---
        System.out.println("Worst Case 1: " + measureExecutionTime(largeArray, -9999)); // Not present
        System.out.println("Worst Case 2: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 500), 10000));
        System.out.println("Worst Case 3: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 200), -10));
        System.out.println("Worst Case 4: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 50), 999));
        System.out.println("Worst Case 5: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 10), 1111));

        // --- 5 Average Case ---
        System.out.println("Average Case 1: " + measureExecutionTime(largeArray, 700));
        System.out.println("Average Case 2: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 500), 350));
        System.out.println("Average Case 3: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 200), 120));
        System.out.println("Average Case 4: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 50), 40));
        System.out.println("Average Case 5: " + measureExecutionTime(Arrays.copyOfRange(largeArray, 0, 10), 7));

        // --- Edge Cases ---
        System.out.println("Empty Array: " + measureExecutionTime(emptyArray, 10));
        System.out.println("Single Element Found: " + measureExecutionTime(singleElement, 5));
        System.out.println("Single Element Not Found: " + measureExecutionTime(singleElement, 10));
        System.out.println("Negative Values: " + measureExecutionTime(negativeValues, -3));
        System.out.println("Duplicates Found: " + measureExecutionTime(duplicates, 1));
    }
}
