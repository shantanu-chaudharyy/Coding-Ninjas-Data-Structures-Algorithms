package Assignment_Recursion1;

public class StringToIntegers {
   
    public static int convertStringToInt(String input){ // 4

    
        if(input.length()==0){
            return 0;//0
    }
    int FirstDigit = input.charAt(0)-'0';//4
    int Rem = convertStringToInt(input.substring(1));//
   
    return (int) (FirstDigit*Math.pow(10, input.length()-1)+ Rem); //1*10^3 + 234; = 1234 
}


    public static void main(String[] args) {
    String input = "00001231";
    System.out.println(convertStringToInt(input));
    }
}
