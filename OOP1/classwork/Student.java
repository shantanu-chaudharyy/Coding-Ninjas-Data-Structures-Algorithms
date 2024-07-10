package OOP1.classwork;

public class Student {
    public String name;
    private int Rollnumber;

    public void SetrollNo(int rn) 
    {
        if(rn <= 0) 
        {
            return;
        }
        Rollnumber = rn; 
    }
        public int getRollNo() 
        {
            return Rollnumber;
        }
}
