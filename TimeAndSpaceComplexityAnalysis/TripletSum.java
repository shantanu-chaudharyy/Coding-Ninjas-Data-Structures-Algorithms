package TimeAndSpaceComplexityAnalysis;

public class TripletSum {
    
    public static int tripletSum(int[] arr, int num) {
		
        int count = 0;
        if(arr.length == 1 || arr.length == 2) {
            return count;
        }

        for(int i = 0; i<arr.length-2; i++) {

                    if(arr[i] + arr[i+1] + arr[i+2] == num) {

                        count++;
                    }
                }
        
        return count;
	}

public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int num = 12;
    System.out.println(tripletSum(arr, num));

}

}