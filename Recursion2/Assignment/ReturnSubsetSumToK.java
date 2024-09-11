package Recursion2.Assignment;

public class ReturnSubsetSumToK {
    
        // Return a 2D array that contains all the subsets which sum to k
        public static int[][] subsetsSumK(int input[], int k) {
            // Write your code here
    
            return helper(input,k,0);
        }
        public static int[][] helper(int input[], int k,int si) {
            if(si==input.length)
            {
                if(k==0)
                    return new int[1][0];
                else
                    return new int[0][0];
            }
        int op1[][]=helper(input,k-input[si],si+1);////////////
        int op2[][]=helper(input,k,si+1);
        int output[][]=new int[op1.length+op2.length][];////////////////
        int l=0;
        for(int i=0;i<op2.length;i++){
            output[i]=new int[op2[i].length];
            for(int j=0;j<op2[i].length;j++)
                output[l][j]=op2[i][j];////////
            l++;
        }
        for(int i=0;i<op1.length;i++){
            output[i+l]=new int[op1[i].length+1];
            output[i+l][0]=input[si];
            for(int j=1;j<=op1[i].length;j++){
                output[i+l][j]=op1[i][j-1];
            }}
            return output;
        }

        public static void main(String[] args) {
             int input[] = {1,2,3,4};
             int k = 5;

            int ans [][] = subsetsSumK(input, k);

            for(int i = 0; i < ans.length; i++) {
                for(int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    