package OOP1;
public class Polynomial {

	 public int degree[]=new int[200];
	public void setCoefficient(int degree, int coeff){ // 2 , 3
     this.degree[degree]=coeff; // 2indx = 3
	}
	public void print(){
		for(int i=0;i<200;i++)
        {
            if(degree[i]!=0) //
                System.out.print(degree[i] +  "x" + (i)+ " ");// 
                // 1x2 , 4x6 ,
        }
	}

	public Polynomial add(Polynomial p) 
   
       // 0 2 0 4
       // 0 2 0 0 0 5
    {
    for(int i=0;i<200;i++) 
    {
        this.degree[i]=this.degree[i] + p.degree[i]; 
        // degree[0] = degree[0]+p.degree[0] = 0 , 4 , 0 , 4 , 0 , 5
    }
        return this;
		
	}
	
	public Polynomial subtract(Polynomial p){

			 for(int i=0;i<200;i++)
             {
                 this.degree[i]=this.degree[i]-p.degree[i];
             }
        return this;
	}
	
	public Polynomial multiply(Polynomial p){

    // 0 3 0
    // 0 0 4
    //
                               
		 int x[]=new int[200]; // 0 , 0 , 0 , 12 ......
        for(int i=0;i<200;i++) // 2
        {
            for(int j=0;j<200;j++)  // 0
            {
                    int deg=i + j; //  3
                if(deg<200)
                {
                    x[deg]= x[deg] + this.degree[i]*p.degree[j];
                    // x[3] = x[3] + 12
                }
            }
        }
        for(int i=0;i<200;i++) // 
            this.degree[i]=x[i]; // 
          return this;
	}

}
