package TimeAndSpaceComplexityAnalysis;

public class CheckArrayRotattion {
    
    public static int arrayRotateCheck(int[] arr){
    
        int result = 0;
        for(int i= 0; i<=arr.length; i++) {

            if(arr[i] > arr[i+1]) {

                result = i+1;
            }
        }
    
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,8,9,10};

        System.out.println(arrayRotateCheck(arr));
    }
}

