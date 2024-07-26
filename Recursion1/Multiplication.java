package Recursion1;

public class Multiplication {

	public static int multiplyTwoIntegers(int m, int n){

        return helper(m, n, 1);
    }
    public static int helper(int m , int n , int i) {

        if(i==n) {
            return m*n ;
        }
        
        return helper(m, n, i+1);
    }
        public static void main(String[] args) {
        
            System.out.println(multiplyTwoIntegers(1001, 10));
    }
    
}
