package Recursion1;

import java.util.Scanner;

public class CalculatePower {

	
        public static int CalPow(int x , int n){
            
            if(n == 0){
                return 1;
            }
            
            int res = CalPow( x,n-1)*x;
            return res;
        }
    
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int n = scan.nextInt();

            int ans = CalPow(x, n);
            System.out.println(ans);

        }
    
    }