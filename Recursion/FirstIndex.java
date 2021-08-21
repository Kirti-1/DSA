import java.util.Scanner;

public class FirstIndex {
	
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
		System.out.println(Solution.firstIndex(input, x));
	}
}

public class Solution {
	static int idx = 0;
	public static int firstIndex(int input[], int x) {
        if(idx == input.length){
            return -1;
        }
        idx++;
        int smaller = firstIndex(input, x); // generating ans from end 
        idx--;
        if(input[idx] == x){
            return idx;
        }return smaller;
        
        // generating ans while iterating from beg
        /*
        if(idx == input.length){
            return -1;
        }
        if(input[idx] == x){
          return idx;  
        }
        idx++;
        return firstIndex(input, x);
        */
	}
	
}