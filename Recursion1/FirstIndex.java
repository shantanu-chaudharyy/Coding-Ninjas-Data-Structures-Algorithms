package Recursion1;

public class FirstIndex {

    private  static int firstIndex(int input[], int x) {
    
        return firstIndex(input, x , 0);
    }
public static int firstIndex(int input[], int x , int i) {
        if(input[i] == x) {
            return i;
        }

        return firstIndex(input, x , i+1);
        

    
}
    
    public static void main(String[] args) {
    
    int input[] = {3,2,1,2,5};
    int x = 2;
    System.out.println(firstIndex(input,x));
        
    }
}
