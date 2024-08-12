package Recursion2;

import java.util.Scanner;

    public class RemoveDuplicates {
        public static String removeConsecutiveDuplicates(String s) {
            if(s.length()<=1) {
                return s;
            }
            if(s.charAt(0) == s.charAt(1)) {
                return  removeConsecutiveDuplicates(s.substring(1));
            }
                
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }
    
        static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    }
}
    
    
    

