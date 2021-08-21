import java.util.Scanner;

public class LastIndex {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.lastIndex(input, x));
	}
}


public class Solution {
	static int idx = 0;
	public static int lastIndex(int input[], int x) {
		
        // travelling from starting of the array
        if(idx == input.length){
            return -1;
        }
        idx++;
        int smallerSolution = lastIndex(input, x);
        idx--;
        if(smallerSolution == -1){
            if(input[idx] == x){
                return idx;
            }
        }
        return smallerSolution;
               
	}
	
}