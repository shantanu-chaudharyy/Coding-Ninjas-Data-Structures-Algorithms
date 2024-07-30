package Recursion2;

public class MergeSort {
 
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {  // Corrected the base condition to ensure meaningful splits
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            Merge(arr, l, mid, r);
        }
    }

    public static void Merge(int arr[], int l, int mid, int r) {
        int len1 = mid - l + 1;
        int len2 = r - mid;
        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArr[i] = arr[l + i];
        }

        for (int i = 0; i < len2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int ptrA = 0, ptrB = 0, ptrC = l;

        while (ptrA < len1 && ptrB < len2) {
            if (leftArr[ptrA] <= rightArr[ptrB]) {
                arr[ptrC] = leftArr[ptrA];
                ptrA++;
            } else {
                arr[ptrC] = rightArr[ptrB];
                ptrB++;
            }
            ptrC++; // Moved this inside the loop to ensure ptrC increments in both cases
        }

        while (ptrA < len1) {
            arr[ptrC] = leftArr[ptrA];
            ptrA++;
            ptrC++;
        }

        while (ptrB < len2) {
            arr[ptrC] = rightArr[ptrB];
            ptrB++;
            ptrC++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

