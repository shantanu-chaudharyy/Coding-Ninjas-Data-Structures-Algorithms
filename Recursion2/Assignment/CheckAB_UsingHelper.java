package Recursion2.Assignment;

public class CheckAB_UsingHelper {
    
    public static boolean checkAB(String input) {
        // Check if the string starts with 'a'
        if (input.charAt(0) == 'a') {
            return Helper(input, 0);
        }
        return false;
    }

    public static boolean Helper(String input, int index) {
        // Base case: If we reach the end of the string, return true
        if (index == input.length()) {
            return true;
        }

        // If the current character is 'a'
        if (input.charAt(index) == 'a') {
            // Check if there's enough space for 'bb'
            if (index + 2 < input.length() && input.charAt(index + 1) == 'b' && input.charAt(index + 2) == 'b') {
                // Recurse by skipping the "abb" pattern
                return Helper(input, index + 3);
            } else {
                // If there's no "bb" after 'a', just move one step forward
                return Helper(input, index + 1);
            }
        }

        // If the current character is 'b', it must be part of "bb"
        if (input.charAt(index) == 'b') {
            // Check if this 'b' is part of "bb"
            if (index + 1 < input.length() && input.charAt(index + 1) == 'b') {
                // Recurse by skipping the "bb" pattern
                return Helper(input, index + 2);
            } else {
                return false;  // Invalid pattern found
            }
        }

        return false;  // If any other character is found, return false
    }

    public static void main(String[] args) {
        String input = "ab";

        System.out.println(checkAB(input));  // Expected output: true
    }
}
