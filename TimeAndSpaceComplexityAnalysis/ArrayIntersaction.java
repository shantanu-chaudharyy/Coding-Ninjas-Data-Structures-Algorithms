package TimeAndSpaceComplexityAnalysis;

import java.util.Arrays;

public class ArrayIntersaction {
    
    public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
    } 

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2,5,2};

        intersection(arr1, arr2);

    }

}

