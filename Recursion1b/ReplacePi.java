import java.util.Scanner;

public class ReplacePi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}

public class solution {

	// Return the changed string
    static String str = "";
    static int idx = 0; 
	public static String replace(String input){
		// Write your code here

        // Iterative solution
        /*
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<input.length();i++){
            if(i<input.length()-1 && input.charAt(i) == 'p' && input.charAt(i+1) == 'i'){
                sb.append("3.14");
                i++;
            }else{
                sb.append(input.charAt(i)+"");
            }
        }
        return sb.toString();
        */
        //Recursive Solution - On the way Up
        if(idx == input.length()){
            return str;
        }
        if(idx<input.length()-1 && input.charAt(idx) == 'p' && input.charAt(idx+1) == 'i'){
            str += "3.14";
            idx+=2;
        }else if(idx<input.length()){
            str += (input.charAt(i)+"");
            idx++;
        }
        return replace(input);
    
	}
}
