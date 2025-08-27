#include <stdio.h>
#define n 6  

void Merge(int arr[], int low, int mid, int high) {
    int n1 = mid - low + 1;
    int n2 = high - mid;
    int left[n1], right[n2];
    for (int i = 0; i < n1; i++)
        left[i] = arr[low + i];
    for (int j = 0; j < n2; j++)
        right[j] = arr[mid + 1 + j];
    int left1 = 0, right1 = 0, k = low;
    while (left1 < n1 && right1 < n2) {
        if (left[left1] <= right[right1]) {
            arr[k++] = left[left1++];
        } else {
            arr[k++] = right[right1++];
        }
    }
    while (left1 < n1) {
        arr[k++] = left[left1++];
    }
    while (right1 < n2) {
        arr[k++] = right[right1++];
    }
}

void MergeSort(int arr[], int low, int high) {
    if (low < high) {
        int mid =(high-low)/2 + low;

        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);

        Merge(arr, low, mid, high);
    }
}

int main() {
    int arr[n] = {1, 10, 14, 17, 2, 3};
    int low = 0, high = n - 1;

    printf("Before Merge Sort Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d\t", arr[i]);
    }

    MergeSort(arr, low, high);

    printf("\nAfter Merge Sort Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d\t", arr[i]);
    }

    return 0;
}
