import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}


public class solution {

    static int idx = 0;
	public static boolean isStringPalindrome(String input) {
		// Write your code here
        if(idx == input.length()/2){
            return true;
        }
        if(input.charAt(idx) != input.charAt(input.length()-idx-1)){
            return false;
        }
        idx++;
        boolean ans = isStringPalindrome(input);
        return ans;

	}
}

