import java.util.Scanner;

public class SumOfArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(Solution.sum(input));
	}
}
class Solution {
    static int idx = 0;
    public static int sum(int[] input) {
        if(idx == input.length-1){
            return input[idx];
        }
        idx++;
        int sosa = sum(input); // sum of smaller sub array 
        idx--;
        return input[idx] + sosa;

    }
}