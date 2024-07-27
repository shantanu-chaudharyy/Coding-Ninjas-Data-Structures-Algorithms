package Assignment_Recursion1;

public class RemoveX {
    
    public static String removeX(String input){ //

        if(input.length() == 0){ // 
            return "";
        }
        if(input.length() == 1 ) {
            if(input.charAt(0) != 'x'){
                return input;
            }
        }
        if(input.charAt(0) == 'x') {
            return removeX(input.substring(1));
        }
        return input.charAt(0) + removeX(input.substring(1));
    }
    public static void main(String[] args) {

        String input = "xaxb";
        System.out.println(removeX(input));
    }

    }