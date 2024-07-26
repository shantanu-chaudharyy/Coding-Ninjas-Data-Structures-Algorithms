package Recursion1;

public class LastIndex {

	public static int lastIndex(int input[], int x) {

        return helper(input, x , input.length-1);
    }

    public static int helper(int input[], int x , int i) {
    
        if(i<0) {
            return -1;
        }
        if(input[i]==x) {
        return i;
        }

        return helper(input, x, i-1);

    }

    public static void main(String[] args) {
        
        int[] input = {1, 2, 3, 4, 1,};
        int x = 1;
        System.out.println(lastIndex(input, x));
    }
    
}
