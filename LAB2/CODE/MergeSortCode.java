public class MergeSortCode{

    static void Merging(int arr[], int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;
s
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int left1 = 0; left1 < n1; left1++)
            left[left1] = arr[start + left1];
        for (int right1 = 0; right1 < n2; right1++)
            right[right1] = arr[middle + 1 + right1];

        int left1 = 0, right1 = 0, k = start;

        while (left1 < n1 && right1 < n2) {
            if (left[left1] <= right[right1]) {
                arr[k++] = left[left1++];
            } else {
                arr[k++] = right[right1++];
            }
        }

        while (left1 < n1) arr[k++] = left[left1++];
        while (right1 < n2) arr[k++] = right[right1++];
    }

    static void Mergesortcode(int arr[], int start, int end) {
        if (start < end) {
            int middle = (end - start) / 2 + start;
            Mergesortcode(arr, start, middle);
            Mergesortcode(arr, middle + 1, end);
            Merging(arr, start, middle, end);
        }
    }

    static void ArrayPrintingFunction(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int TestCaseArray1[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Test Case 1 - Already Sorted Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray1);
        Mergesortcode(TestCaseArray1, 0, TestCaseArray1.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray1);
       
        int TestCaseArray2[] = {9, 8, 7, 6, 5, 4};
        System.out.println("Test Case 2 - Reverse Order Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray2);
        Mergesortcode(TestCaseArray2, 0, TestCaseArray2.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray2);
       
        int TestCaseArray3[] = {10, 1, 14, 17, 2, 3};
        System.out.println("Test Case 3 - Random Order Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray3);
        Mergesortcode(TestCaseArray3, 0, TestCaseArray3.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray3);
       
        int TestCaseArray4[] = {5, 1, 3, 5, 2, 5};
        System.out.println("Test Case 4 - Array With Duplicates");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray4);
        Mergesortcode(TestCaseArray4, 0, TestCaseArray4.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray4);
       
        int TestCaseArray5[] = {42};
        System.out.println("Test Case 5 - Single Element Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray5);
        Mergesortcode(TestCaseArray5, 0, TestCaseArray5.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray5);
        
        int TestCaseArray6[] = {99, 11};
        System.out.println("Test Case 6 - Two Elements Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray6);
        Mergesortcode(TestCaseArray6, 0, TestCaseArray6.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray6);
        
        int TestCaseArray7[] = {7, 7, 7, 7, 7, 7};
        System.out.println("Test Case 7 - All Same Elements Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray7);
        Mergesortcode(TestCaseArray7, 0, TestCaseArray7.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray7);
       
        int TestCaseArray8[] = {1000, 500, 2000, 1500, 2500};
        System.out.println("Test Case 8 - Large Numbers Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray8);
        Mergesortcode(TestCaseArray8, 0, TestCaseArray8.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray8);
       
        int TestCaseArray9[] = {-5, -10, -3, -1, -7};
        System.out.println("Test Case 9 - Negative Numbers Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray9);
        Mergesortcode(TestCaseArray9, 0, TestCaseArray9.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray9);
       
        int TestCaseArray10[] = {-2, 4, 0, -9, 7, 3};
        System.out.println("Test Case 10 - Mix Positive & Negative Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(TestCaseArray10);
        Mergesortcode(TestCaseArray10, 0, TestCaseArray10.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(TestCaseArray10);
    }
}
