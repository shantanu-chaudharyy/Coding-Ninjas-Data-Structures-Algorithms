package OOP1.classwork;

public class Student {
    public String name;
    private final int Rollnumber;

    private static int NumOfStudent; 
    
    public static int GetNumOfStudent() 
    {
        return NumOfStudent;
    }

    public Student(String name , int Rollnumber) {

        this.name = name;
       this.Rollnumber = Rollnumber;
       NumOfStudent++;
    }

    // public void SetrollNo(int rn) 
    // {
    //     if(rn <= 0) 
    //     {
    //         return;
    //     }
    //     Rollnumber = rn; 
    // }
        // public int getRollNo() 
        // {
        //     return Rollnumber;
        // }

        public void print() 
        {
            System.out.println(name +":" + Rollnumber);
        }
}
