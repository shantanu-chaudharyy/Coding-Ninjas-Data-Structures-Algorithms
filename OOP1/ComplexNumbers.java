package OOP1;
public class ComplexNumbers {
	// Complete this class
    private int real;
    private int imag;
    
    public ComplexNumbers(int real,int imag)
    {
        this.real=real;
        this.imag=imag;
    }
    
    public void plus(ComplexNumbers c)
    {
        this.real+=c.real;
        this.imag+=c.imag;
    }
    
    public void multiply(ComplexNumbers c)
    {
        int newReal=((this.real)*(c.real))-(this.imag*c.imag);
        int newImag=(this.real*c.imag)+(this.imag*c.real);
        this.real=newReal;
        this.imag=newImag;
    }
    
    public void print()
    {
        System.out.print(this.real+" + i"+this.imag);
    }
	
}
