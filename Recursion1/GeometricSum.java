package Recursion1;

// 1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500

public class GeometricSum {
    
    public static double findGeometricSum(int k)
    {
        if(k==0)
            return 1;
        double smallans=findGeometricSum(k-1);
        return smallans+(1/Math.pow(2,k));
  
  
  
    }
  
  
  
      public static void main(String[] args) {
          
          int k = 3;
          double ans = findGeometricSum(k);
          System.out.println(findGeometricSum(k));
  
  
  }
  }