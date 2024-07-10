import OOP1.classwork.Student;
public class StudentUse2 {
    public static void main(String[] args) {
    
        Student s4 = new Student();
    
        s4.name = "Shantanu";
        s4.SetrollNo(112);
    
    
        Student s5 = new Student();
    
        s5.name = "Ram";
        s5.SetrollNo(8);
    
    System.out.println(s4);
        System.out.println(s4.name);
        System.out.println(s5.name);
        System.out.println(s4.getRollNo());
        System.out.println(s5.getRollNo());
    }
    }