package TimeAndSpaceComplexityAnalysis;

import java.util.Arrays;

public class FindTheUniqueElement {
    
    	public static int findUnique(int[] arr) { // 2,1,6,6,2 , 1,2,2,6,6

       Arrays.sort(arr);

       
       for(int i = 0; i<arr.length-1; i+=2) { //1,1,2,2,6

        if(arr[i] != arr[i+1]) {
            return arr[i];
        }
        
       }
       return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,1,6,6,2,1,2};
        System.out.println(findUnique(arr));
      
        
    }

}

