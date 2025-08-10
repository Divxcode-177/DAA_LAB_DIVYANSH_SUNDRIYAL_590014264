package LAB1;
import java.util.*;
public class BinarySearchCode{
    public static int BinarySearchFunction(int[] arr, int item) {     //BINARY SEARCH CODE
                int low=0 , high = arr.length-1;

                while(low<=high) {
                   int mid=low+(high-low)/2; //

                   if(arr[mid]==item) {
                    return mid;
                   } else if(arr[mid]<item) {
                    low = mid + 1;
                   } else {
                    high=mid-1;
                   }
                }
                return -1; //ELEMENT NOT FOUND IN THE ARRAY
    }
   public static double  MeasureExecutionTime(int[] arr, int target) {
    long startTime = System.nanoTime();

        BinarySearchFunction(arr, target);

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1e6;    // CONVERT TO MILISECONDS
    
   } 

    public static void main(String[] args) {
        // TESTING OF ARRAYS
        int[] emptyArray = {};                                 //EMPTY ARRAY
        int[] singleElement = {5};                             //SINGLE ELEMENT
        int[] negativeValues = {-5, -3, 0, 2, 4, 6, 8};        //NEGATIVE VALUES
        int[] duplicates = {1, 1, 1, 1, 1, 1, 1};               //DUPLICATES
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }

        System.out.println("Execution Times (milliseconds):");

        // --- 5 Best Case ---
        System.out.println("Best Case 1: " + MeasureExecutionTime(largeArray, largeArray[500]));
        System.out.println("Best Case 2: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 500), 250));
        System.out.println("Best Case 3: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 200), 100));
        System.out.println("Best Case 4: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 50), 25));
        System.out.println("Best Case 5: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 10), 5));

        // --- 5 Worst Case ---
        System.out.println("Worst Case 1: " + MeasureExecutionTime(largeArray, -9999)); // Not present
        System.out.println("Worst Case 2: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 500), 10000));
        System.out.println("Worst Case 3: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 200), -10));
        System.out.println("Worst Case 4: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 50), 999));
        System.out.println("Worst Case 5: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 10), 1111));

        // --- 5 Average Case ---
        System.out.println("Average Case 1: " + MeasureExecutionTime(largeArray, 700));
        System.out.println("Average Case 2: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 500), 350));
        System.out.println("Average Case 3: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 200), 120));
        System.out.println("Average Case 4: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 50), 40));
        System.out.println("Average Case 5: " + MeasureExecutionTime(Arrays.copyOfRange(largeArray, 0, 10), 7));

        // --- Edge Cases ---
        System.out.println("Empty Array: " + MeasureExecutionTime(emptyArray, 10));
        System.out.println("Single Element Found: " + MeasureExecutionTime(singleElement, 5));
        System.out.println("Single Element Not Found: " + MeasureExecutionTime(singleElement, 10));
        System.out.println("Negative Values: " + MeasureExecutionTime(negativeValues, -3));
        System.out.println("Duplicates Found: " + MeasureExecutionTime(duplicates, 1));
    }
}