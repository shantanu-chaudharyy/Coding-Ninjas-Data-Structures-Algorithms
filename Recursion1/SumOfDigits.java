package Recursion1;

public class SumOfDigits {
    
    public static int sumOfDigits(int input){
       if(input == 0) {
        return 0;
       }
       if(input < 10) {
        return input;
       }
       int lastDig = input%10;
       return lastDig+sumOfDigits(input/10);
}

    public static void main(String[] args) {
        int input = 347;
       System.out.println(sumOfDigits(input)); 
    }
}
