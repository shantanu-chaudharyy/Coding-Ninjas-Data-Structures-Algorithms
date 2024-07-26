package Recursion1;

public class CountZeroes {
    
	public static int countZerosRec(int input){
        if(input == 0) {
            return 1;
        }else{
            return 0;
        }

       int lastDig = input % 10;

        if(lastDig == 0) {
            return 1+countZerosRec(input%10);
        }else{
            return 0+countZerosRec(input/10);
        }
    }
        public static void main(String[] args) {
    
            int input = 813748;
            System.out.println(countZerosRec(input));
}

}
