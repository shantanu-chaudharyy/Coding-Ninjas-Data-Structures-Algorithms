package Assignment_Recursion1;

public class PairStars {

    public static String addStars(String s) {
    
        if(s.length()==0) {
            return "";
        }
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" + addStars(s.substring(1));
        }
        return s.charAt(0) + addStars(s.substring(1));
        }
public static void main(String[] args) {
        
    String S = "aaabbb";
    System.out.println(addStars(S)); 
    }
    
}
