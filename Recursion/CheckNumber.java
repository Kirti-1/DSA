import java.util.Scanner;

public class CheckNumber {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(Solution.checkNumber(input, x));
	}
}
class Solution {
    static int idx = 0;
    public static boolean checkNumber(int[] input, int x){
        if(idx == input.length){
            return false;
        }
        if(input[idx] == x){
            return true;
        }
        idx++;
        return checkNumber(input, x);
    }

}