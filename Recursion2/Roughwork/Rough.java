package Recursion2.Roughwork;

public class Rough {
        public static String[] findSubsequences(String str){ // z
       
        String[] array = findSubsequences(str);  // Function is called, and the result is stored in `array`
        
        // Now you can use the `array` variable to access the subsequences
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        String str = "xyz";
        findSubsequences(str);
    }
}
