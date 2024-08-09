package Recursion2;

public class MergeSort {
 
        // Recursive method to perform merge sort on the array
        public static void mergeSort(int[] arr, int l, int r) {
            if (l < r) {  // Base condition to ensure meaningful splits
                int mid = (l + r) / 2;  // Find the middle point
    
                // Recursively sort the first half
                mergeSort(arr, l, mid);
                // Recursively sort the second half
                mergeSort(arr, mid + 1, r);
    
                // Merge the two sorted halves
                merge(arr, l, mid, r);
            }
        }
        // Method to merge two sorted halves of the array
        public static void merge(int arr[], int l, int mid, int r) {
            int len1 = mid - l + 1; // Length of the first half
            int len2 = r - mid; // Length of the second half
    
            // Temporary arrays to hold the split halves
            int leftArr[] = new int[len1];
            int rightArr[] = new int[len2];
    
            // Copy data to the temporary arrays
            for (int i = 0; i < len1; i++) {
                leftArr[i] = arr[l + i];
            }
            for (int j = 0; j < len2; j++) {
                rightArr[j] = arr[mid + 1 + j];
            }
    
            // Merge the temporary arrays back into the original array
            int i = 0, j = 0, k = l;
    
            // Merge elements in sorted order
            while (i < len1 && j < len2) {
                if (leftArr[i] <= rightArr[j]) {
                    arr[k] = leftArr[i];
                    i++;
                } else {
                    arr[k] = rightArr[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of leftArr[], if any
            while (i < len1) {
                arr[k] = leftArr[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of rightArr[], if any
            while (j < len2) {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
       
  
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 4, 2};
        int r = arr.length;

        mergeSort(arr, 0, r - 1);

        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

