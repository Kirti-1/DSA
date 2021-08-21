import java.util.Scanner;

public class CountZeros {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.countZerosRec(n));
	}
}


public class solution {

	public static int countZerosRec(int n){
		// Write your code here
        if(n == 0 && n%10==0){
            return 1;
        }
        if(n/10==0){
            return 0;
        }
        if(n%10==0){
            return 1 + countZerosRec(n/10);
        }
        return countZerosRec(n/10);
               
	}
}
