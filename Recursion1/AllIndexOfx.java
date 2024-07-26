package Recursion1;

import java.util.Scanner;

public class AllIndexOfx {

    public static int[] allIndexes(int input[], int x) {  
        return helper(input, x, 0);
    }

    public static int[] helper(int input[], int x, int i) {
        // Base case: If we reach the end of the array
        if (i == input.length) {
            return new int[0]; // Return an empty array
        }

        // Recursive step: Get the result for the rest of the array
        int[] smallOutput = helper(input, x, i + 1);

        // If the current element matches x, include this index
        if (input[i] == x) {
            int[] output = new int[smallOutput.length + 1];
            output[0] = i;
            for (int j = 0; j < smallOutput.length; j++) {
                output[j + 1] = smallOutput[j];
            }
            return output;
        } else {
            // Otherwise, return the result for the rest of the array
            return smallOutput;
        }
    }

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int[] input = takeInput();
		int x = s.nextInt();
		int output[] = allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}