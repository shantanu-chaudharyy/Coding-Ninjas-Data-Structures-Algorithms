package TimeAndSpaceComplexityAnalysis;

public class RotateArray {
   
    public static void rotate(int[] arr, int d) {
        
        // Handle the edge case where the array has only one element.
        if (arr.length == 0) {
            return; // No rotation needed for a single-element array.
        }

        // Normalize the value of d to handle cases where d > arr.length
        d = d % arr.length;

        // Create a temporary array to store the first d elements
        int[] temp = new int[d];

        // Copy the first d elements into the temporary array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left by d positions
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }

        // Copy the elements from the temporary array to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int d = 1;
        rotate(arr, d);
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
