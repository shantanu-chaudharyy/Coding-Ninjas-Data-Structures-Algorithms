package Recursion2.Assignment;

import java.util.Scanner;

public class BinarySearch {
    
	public static int binarySearch(int input[], int element) {
		return helper(input, element, 0, input.length-1);
	}
	public static int helper(int input[], int element , int low , int high) {

		
        if(low > high) {
            return -1;
        }

		int mid = (low+high)/2;
		if(element == input[mid]) {
			return mid;
		}
		else if(element < input[mid]) {
			return helper(input, element, low, mid-1);
		}
		else{
			return helper(input, element, mid+1, high);
		}
}
static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}
}


