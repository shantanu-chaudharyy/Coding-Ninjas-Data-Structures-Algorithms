package Recursion1;

import java.util.Scanner;

public class CalculatePower {

	
        public static long CalPow(long  x , int n){
            
            if(n == 0){
                return 1;
            }
            
         long ans = CalPow( x,n-1)*x;
           return ans;
        }
    
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            long x = scan.nextLong();
            int n = scan.nextInt();

            long ans = CalPow(x, n);
            System.out.println(ans);

        }
    
    }