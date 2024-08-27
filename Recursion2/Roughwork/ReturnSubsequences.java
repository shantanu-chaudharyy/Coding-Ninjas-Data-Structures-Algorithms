package Recursion2.Roughwork;

import java.util.Scanner;

public class ReturnSubsequences {

    public static void subsequence(String str , String OutputSofar) {
        if(str.length() == 0) {
            System.out.println(OutputSofar);
            return;
        }
        subsequence(str.substring(1), OutputSofar);
        subsequence(str.substring(1), OutputSofar + str.charAt(0) );
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        subsequence(str, "");
    }
}
