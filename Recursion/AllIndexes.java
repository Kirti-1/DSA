import java.util.Scanner;

public class AllIndexes {
	
	static Scanner scn = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = scn.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = scn.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = scn.nextInt();
		int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}


public class Solution {
    static int idx = 0;
    static int ifsf = 0; // index of array found so far
	public static int[] allIndexes(int input[], int x) {
        if(idx == input.length){
            return new int[ifsf];
        }
        int []ans; // it can be left un initialized as by default it'll contain null reference
        if(input[idx] == x){
            ifsf++;
            idx++;
            ans = allIndexes(input, x);
            idx--;
            ifsf--;
            ans[ifsf] = idx; 
        }else{
            idx++;
            ans = allIndexes(input, x);
            idx--;
        }
        return ans;		
	}
	
}