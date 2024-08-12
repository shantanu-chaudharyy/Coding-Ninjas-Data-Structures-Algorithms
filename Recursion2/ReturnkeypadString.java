package Recursion2;

import java.util.Scanner;

public class ReturnkeypadString {
    // Return a string array that contains all the possible strings
	public static String[] SingleDigits(int n) {

        if(n == 0 || n == 1) {
            String[] Output = {""};
            return Output;
        }

        if(n == 2) {
            String Output[] = {"a","b","c"};
            return Output;
        }
        if(n == 3) {
            String Output[] = {"d","e","f"};
            return Output;
        }
        if(n == 4) {
            String Output[] = {"g","h","i"};
            return Output;
        }
        if(n == 5) {
            String Output[] = {"j","k","l"};
            return Output;
        }
        if(n == 6) {
            String Output[] = {"m","n","o"};
            return Output;
        }
        if(n == 7) {
            String Output[] = {"p","q","r","s"};
            return Output;
        }
        if(n == 8) {
            String Output[] = {"t","u","v"};
            return Output;
        }else{
            String Output[] = {"w","x","y","z"};
            return Output;
        }


    }

	public static String[] keypad(int n){
		
        if(n==0 || n==1) {
         String Output[] = {""};
            return Output;
        }

        String SmallAns[] = keypad(n/10);
        String Smalldigit[] = SingleDigits(n%10);
        String ResultArray[] = new String[SmallAns.length*Smalldigit.length];

        int k = 0;
        for(int i = 0; i < SmallAns.length; i++) {
            for(int j = 0; j<Smalldigit.length; j++) {
                ResultArray[k] = SmallAns[i]+Smalldigit[j];
                k++;
            }
        }
        return ResultArray;

	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String Ans[] = keypad(n);

        for(int i =0; i<Ans.length; i++) {
            System.out.println(Ans[i]);
        }
    }
	
}
