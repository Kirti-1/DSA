import java.util.Scanner;

public class RemoveX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}

public class solution {

	// Return the changed string
    static int idx = 0;
	public static String removeX(String input){
		// Write your code here
       
        if(idx == input.length()){
            idx--;
            return "";
        }
        idx++;
        String str = removeX(input);
        if(idx>=0 && input.charAt(idx) != 'x'){
            str = input.charAt(idx) + str;
        }
        idx--;
        return str;
	}
}

