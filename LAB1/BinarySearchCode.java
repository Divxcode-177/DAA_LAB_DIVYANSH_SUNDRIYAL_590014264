package LAB1;
import java.util.*;

public class BinarySearchCode {

    // Binary Search Logic
    public static int performBinarySearch(int[] inputArray, int searchValue) {
        int startIndex = 0;
        int endIndex = inputArray.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (inputArray[middleIndex] == searchValue) {
                return middleIndex;
            } else if (inputArray[middleIndex] < searchValue) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    // Execution Time Calculator
    public static double getExecutionDuration(int[] testArray, int findNumber) {
        long beginTime = System.nanoTime();

        performBinarySearch(testArray, findNumber);

        long finishTime = System.nanoTime();
        return (finishTime - beginTime) / 1e6; // milliseconds
    }

    // Function to Generate Sorted Random Array
    public static int[] createRandomSortedArray(int length, int bound) {
        Random rng = new Random();
        int[] tempArray = new int[length];
        for (int i = 0; i < length; i++) {
            tempArray[i] = rng.nextInt(bound * 2) - bound; // random negative & positive
        }
        Arrays.sort(tempArray);
        return tempArray;
    }

    public static void main(String[] args) {
        // Random Arrays for Testing
        int[] zeroLengthArray = {};
        int[] singleItemArray = {42};
        int[] negativeArray = {-15, -10, -5, 0, 5, 10};
        int[] duplicateArray = {4, 4, 4, 4, 4, 4, 4};

        int[] bigArray = createRandomSortedArray(1000, 500);

        System.out.println("Execution Time Results (milliseconds):\n");

        // Best Case Scenarios
        System.out.println("Best Case 1: " + getExecutionDuration(bigArray, bigArray[bigArray.length / 2]));
        System.out.println("Best Case 2: " + getExecutionDuration(createRandomSortedArray(500, 200), 100));
        System.out.println("Best Case 3: " + getExecutionDuration(createRandomSortedArray(200, 100), 50));
        System.out.println("Best Case 4: " + getExecutionDuration(createRandomSortedArray(50, 25), 10));
        System.out.println("Best Case 5: " + getExecutionDuration(createRandomSortedArray(10, 5), 2));

        // Worst Case Scenarios
        System.out.println("Worst Case 1: " + getExecutionDuration(bigArray, 99999));
        System.out.println("Worst Case 2: " + getExecutionDuration(createRandomSortedArray(500, 200), -999));
        System.out.println("Worst Case 3: " + getExecutionDuration(createRandomSortedArray(200, 100), 8888));
        System.out.println("Worst Case 4: " + getExecutionDuration(createRandomSortedArray(50, 25), -5000));
        System.out.println("Worst Case 5: " + getExecutionDuration(createRandomSortedArray(10, 5), 300));

        // Average Case Scenarios
        System.out.println("Average Case 1: " + getExecutionDuration(bigArray, bigArray[700]));
        System.out.println("Average Case 2: " + getExecutionDuration(createRandomSortedArray(500, 200), 120));
        System.out.println("Average Case 3: " + getExecutionDuration(createRandomSortedArray(200, 100), 60));
        System.out.println("Average Case 4: " + getExecutionDuration(createRandomSortedArray(50, 25), 15));
        System.out.println("Average Case 5: " + getExecutionDuration(createRandomSortedArray(10, 5), 1));

        // Edge Cases
        System.out.println("Empty Array: " + getExecutionDuration(zeroLengthArray, 7));
        System.out.println("Single Element Found: " + getExecutionDuration(singleItemArray, 42));
        System.out.println("Single Element Not Found: " + getExecutionDuration(singleItemArray, 99));
        System.out.println("Negative Values: " + getExecutionDuration(negativeArray, -10));
        System.out.println("Duplicates Found: " + getExecutionDuration(duplicateArray, 4));
    }
}
