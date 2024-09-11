package Recursion2.Assignment;

import java.util.Scanner;

public class Staircase {
    public static int staircase(int n){  
		
        // Base cases
        if (n == 0) return 1; // 1 way to stay on the ground
        if (n == 1) return 1; // 1 way to reach the first step
        if (n == 2) return 2; // 2 ways to reach the second step
        if (n == 3) return 4; // 4 ways to reach the third step
        
        // Recursive relation
        return staircase(n-1) + staircase(n-2) + staircase(n-3); 
    

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
	}
}

