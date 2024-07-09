package OOP1.classwork;

import java.util.Scanner;


public class StudentUse {
    public static void main(String[] args) {
        
    
    
    Scanner s = new Scanner(System.in);

    Student s1 = new Student();

    s1.name = "Shantanu";
    s1.Rollnumber = 112;


    Student s2 = new Student();

    s2.name = "Ram";
    s2.Rollnumber = 8;

System.out.println(s1);
    System.out.println(s1.name);
    System.out.println(s2.name);
    System.out.println(s1.Rollnumber);
    System.out.println(s2.Rollnumber);
}
}