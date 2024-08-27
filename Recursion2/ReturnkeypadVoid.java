package Recursion2;

import java.util.Scanner;

public class ReturnkeypadVoid {
    public static String[] SingleDigits(int input) {
        if (input == 0 || input == 1) {
            return new String[]{""};
        } else if (input == 2) {
            return new String[]{"a", "b", "c"};
        } else if (input == 3) {
            return new String[]{"d", "e", "f"};
        } else if (input == 4) {
            return new String[]{"g", "h", "i"};
        } else if (input == 5) {
            return new String[]{"j", "k", "l"};
        } else if (input == 6) {
            return new String[]{"m", "n", "o"};
        } else if (input == 7) {
            return new String[]{"p", "q", "r", "s"};
        } else if (input == 8) {
            return new String[]{"t", "u", "v"};
        } else {
            return new String[]{"w", "x", "y", "z"};
        }
    }
	public static void printKeypad(int input){
        
		        printKeypadHelper(input, "");

	}
     private static void printKeypadHelper(int input, String combination) {
        if (input == 0 || input == 1) {
            System.out.println(combination);
            return;
        }

        // Get possible letters for the last digit
        String[] letters = SingleDigits(input % 10);

        // Recursively append each letter and proceed with the rest of the number
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            printKeypadHelper(input / 10, letter + combination);
        }
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        printKeypad(input);
        
    }
}
