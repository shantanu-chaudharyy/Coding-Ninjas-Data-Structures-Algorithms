package Recursion1;

import java.util.Scanner;

public class ChecknumberRecursively {
  
        public static boolean checkNumber(int input[], int x) {
            
            return helper(input, x, 0);
        }
        public static boolean helper(int input[] , int x, int index) {
    
            if(index >= input.length) {
                return false;
            }
            if(input[index]==x) {
                return true;
            }
                boolean ans = helper(input, x, index+1);
            return ans;
        }

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
       
		System.out.println(checkNumber(input, x));
	}


}

