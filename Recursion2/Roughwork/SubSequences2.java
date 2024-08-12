package Recursion2.Roughwork;

public class SubSequences2 {
//Recursive call ;
// First call ; XYZ
// Second call ; YZ
// Third call ; Z
// Fourth call ; ""
// fifth call ; Z
// sixth call ; YZ
// seventh call ; XYZ


    public static String[] findSubsequences(String str){ 
		
		if(str.length() == 0){
			String ans[] = {""}; 
			return ans;
		}
		
		String smallAns[] = findSubsequences(str.substring(1));
		String ans[] = new String[2 * smallAns.length];
	 
	
		int k = 0; // we will reset after returning ans[];

		// in this loop we are copying the last array
		for(int i = 0; i < smallAns.length; i++){  
			ans[k] = smallAns[i];  
			k++;
		}
		
		// and in this loop we are adding the first index
		for(int i = 0; i < smallAns.length; i++){ 
			
			ans[k] = str.charAt(0) + smallAns[i];  
			k++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		String str = "xyz";
		String ans[] = findSubsequences(str);
		for(int i = 0; i < ans.length; i++){
			System.out.println(ans[i]);
		}
		
	}

}
    
// package Recursion2.Roughwork;

// public class SubSequences2 {
//     public static String[] findSubsequences(String str) {
//         // Base Case: Jab input string empty ho jaaye
//         if (str.length() == 0) {
//             String ans[] = {""}; // Ek array return karo jisme sirf ek empty string ho
//             return ans;
//         }

//         // Recursive Case: Ab string ke first character ko chhod kar baaki string ka subsequence nikaalte hain
//         String smallAns[] = findSubsequences(str.substring(1)); 
//         // smallAns mein subsequences hote hain uss string ke jo first character ko chhod kar bachi hui hoti hai

//         // Ab ek naya array banate hain jo final subsequences store karega
//         String ans[] = new String[2 * smallAns.length]; // size double isliye, kyunki naye subsequences mein first character bhi add hoga

//         int k = 0; // ye index hai jo ans array mein subsequences dalne ke liye use hoga

//         // Pehle, smallAns wale subsequences ko ans array mein copy karte hain
//         for (int i = 0; i < smallAns.length; i++) {
//             ans[k] = smallAns[i]; // subsequence ko waisa ka waisa ans mein daal do
//             k++; // next position par move karo
//         }

//         // Ab naye subsequences banao by adding first character of original string to each subsequence in smallAns
//         for (int i = 0; i < smallAns.length; i++) {
//             ans[k] = str.charAt(0) + smallAns[i]; // first character ko concatenate karke subsequence banao
//             k++; // next position par move karo
//         }

//         // Final array return karo jisme saare subsequences hain
//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "xyz"; // Wo string jiska subsequence nikaalna hai
//         String ans[] = findSubsequences(str); // function call karke subsequences ko ans array mein store karlo

//         // Saare subsequences print karo
//         for (int i = 0; i < ans.length; i++) {
//             System.out.println(ans[i]); // har subsequence ko print kar do
//         }
//     }
// }

