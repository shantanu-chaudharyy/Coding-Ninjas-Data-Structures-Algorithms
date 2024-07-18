package Recursion1;

import java.util.Scanner;

public class NumberOfDigit {
    public static int countDigits(int n){
        
         if(n == 0) 
         {
             return 0;
         } 
             
             int ans = countDigits(n/10 ) + 1;
               
                 return ans;
             
     }
 
 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
     int a =   countDigits(n);
        System.out.println(a);
    }
}
