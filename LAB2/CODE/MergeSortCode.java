public class MergeSortCode{

   public static void Merging(int mainArray[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int left1 = 0; left1 < n1; left1++)
            left[left1] = mainArray[low + left1];
        for (int right1 = 0; right1 < n2; right1++)
            right[right1] = mainArray[mid + 1 + right1];

        int left1 = 0, right1 = 0, k = low;

        while (left1 < n1 && right1 < n2) {
            if (left[left1] <= right[right1]) {
                mainArray[k++] = left[left1++];
            } else {
                mainArray[k++] = right[right1++];
            }
        }

        while (left1 < n1) mainArray[k++] = left[left1++];
        while (right1 < n2) mainArray[k++] = right[right1++];
    }

    public static void Mergesortcode(int mainArray[], int low, int high) {
        if (low < high) {
            int mid = (high - low) / 2 + low;
            Mergesortcode(mainArray, low, mid);
            Mergesortcode(mainArray, mid + 1, high);
            Merging(mainArray, low, mid, high);
        }
    }

  public static void ArrayPrintingFunction(int mainArray[]) {
        for (int i = 0; i < mainArray.length; i++) {
            System.out.print(mainArray[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int case1[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Test Case 1 - Already Sorted Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case1);
        Mergesortcode(case1, 0, case1.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case1);
       
        int case2[] = {9, 8, 7, 6, 5, 4};
        System.out.println("Test Case 2 - Reverse Order Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case2);
        Mergesortcode(case2, 0, case2.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case2);
    
        int case3[] = {10, 1, 14, 17, 2, 3};
        System.out.println("Test Case 3 - Random Order Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case3);
        Mergesortcode(case3, 0, case3.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case3);

        int case4[] = {5, 1, 3, 5, 2, 5};
        System.out.println("Test Case 4 - Array With Duplicates");
        System.out.print("Before: ");
        ArrayPrintingFunction(case4);
        Mergesortcode(case4, 0, case4.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case4);

        int case5[] = {42};
        System.out.println("Test Case 5 - Single Element Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case5);
        Mergesortcode(case5, 0, case5.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case5);
  
        int case6[] = {99, 11};
        System.out.println("Test Case 6 - Two Elements Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case6);
        Mergesortcode(case6, 0, case6.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case6);

        int case7[] = {7, 7, 7, 7, 7, 7};
        System.out.println("Test Case 7 - All Same Elements Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case7);
        Mergesortcode(case7, 0, case7.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case7);

        int case8[] = {1000, 500, 2000, 1500, 2500};
        System.out.println("Test Case 8 - Large Numbers Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case8);
        Mergesortcode(case8, 0, case8.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case8);

        int case9[] = {-5, -10, -3, -1, -7};
        System.out.println("Test Case 9 - Negative Numbers Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case9);
        Mergesortcode(case9, 0, case9.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case9);

        int case10[] = {-2, 4, 0, -9, 7, 3};
        System.out.println("Test Case 10 - Mix Positive & Negative Array");
        System.out.print("Before: ");
        ArrayPrintingFunction(case10);
        Mergesortcode(case10, 0, case10.length - 1);
        System.out.print("After:  ");
        ArrayPrintingFunction(case10);
    }
}
