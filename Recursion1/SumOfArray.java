package Recursion1;
import java.util.Scanner;

public class SumOfArray {
    
	public static int sum(int[] input) {
		if (input.length == 0) {
				 return 0;
			 }
	 
			 // The sum starts with the first element of the array
			 int sum = input[0];
	 
			 // Create a smaller array excluding the first element
			 int smallInput[] = new int[input.length - 1];
			 for (int i = 1; i < input.length; i++) {
				 smallInput[i - 1] = input[i];
			 }
	 
			 // Recursively call SumofArray on the smaller array and add to the sum
			 sum += sum(smallInput);
			 
			 return sum;
		 }
	 
	 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int ans = sum(input);
		System.out.println(ans);
}
}