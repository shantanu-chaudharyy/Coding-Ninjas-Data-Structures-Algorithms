package Recursion1;

import java.util.Scanner;

public class PrintNumbers {
    
    public static void print(int n){

        if(n == 0) 
        {
            return;
        }	
        print(n-1);
        System.out.print(n+" ");
    }
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         print(n);
        // System.out.println(a);
    }
}
