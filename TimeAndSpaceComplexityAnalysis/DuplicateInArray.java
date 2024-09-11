package TimeAndSpaceComplexityAnalysis;

import java.util.Arrays;

public class DuplicateInArray {
     public static int findDuplicate(int[] arr) {

        Arrays.sort(arr);
        int result = 0;

        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                result = arr[i];
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate element is: " + duplicate);

}
}

