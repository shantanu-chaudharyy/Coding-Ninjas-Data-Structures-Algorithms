// Explanation:
// quickSort(array, startIndex, endIndex):

// If the startIndex is less than the endIndex, the function proceeds.
// It calls the partition function to get the pivotIndex.
// Recursively calls quickSort on the subarrays before and after the pivotIndex.
// partition(array, startIndex, endIndex):

// Sets the pivotElement to the value at endIndex.
// Initializes i to startIndex - 1.
// Loops from startIndex to endIndex - 1. If an element is less than the pivotElement, it increments i and swaps the current element with the element at index i.
// After the loop, it swaps the pivotElement with the element at i + 1.
// Returns the new pivotIndex.
// swap(array, i, j):

// Swaps the elements at indices i and j in the array.
// main():

// Initializes the array with sample values.
//Calls quickSort on the entire array.
//Prints the sorted array.

package Recursion2;

public class QuickSort {
    
    public static void quickSort(int[] input, int startIndex, int endIndex) { // 1,0,2,3,5; 0; 1
        if (startIndex < endIndex) { //0<4
            int pivotIndex = pivot(input, startIndex, endIndex); // pivotIndex = 0 
            quickSort(input, startIndex, pivotIndex - 1); // 
            quickSort(input, pivotIndex + 1, endIndex);
        }
    }

    public static int pivot(int[] input, int si, int ei) { // 1,0,2,3,5; 0; 1
        int PivotElement = input[ei]; //0
        int count = si - 1;//-1
        for (int j = si; j < ei; j++) { // j = 0 ; j<1
            if (input[j] < PivotElement) { // 
                count++;//1
                swap(input, count, j); // swap input[1] & input[2]; //1,0,5,3,2
            }
        }
        swap(input, count + 1, ei); // swap input[0] & input[1] //0,1,2,3,5
        return count + 1;
    }
        
    public static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {
        int input[] = {5, 5, 0, 3, 2};
        quickSort(input, 0, input.length - 1);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
