package Recursion2.Roughwork;

public class SubSequences1 {
    static void subseq(String p, String up) {// b , c
        if (up.length()==0) {
    System.out.print(p + " ");// abc , ab , ac , a
    return;
}
char ch = up.charAt(0); // b
subseq(p + ch, up.substring(1));//b , c
subseq(p, up.substring(1)); // "" , c
}
public static void main(String[] args) {

subseq("", "abc");

}

}
