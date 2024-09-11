package TimeAndSpaceComplexityAnalysis;

public class PairSuminArray {
    
    public static int pairSum(int[] arr, int num) { //1,3,6,2,5,4,3,2,4

        int count = 0;
               if(arr.length==1 ) {
                   
                   return 0;
               }
       
              
               for(int i =	0; i<arr.length; i++) {
       
                   for(int j = i+1; j<arr.length; j++) { // 
       
                       if(arr[i] + arr[j] == num) { //arr[0] + arr[2] = num
       
                           count++;
                          
                       
                       }
                   }
               }
       
               return count;
       }
       
public static void main(String[] args) {
    int[] arr = {1,3,6,2,5,4,3,2,4};
    int num = 7;
    System.out.println(pairSum(arr, num));
    }
}


