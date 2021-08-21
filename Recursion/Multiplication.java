import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(solution.multiplyTwoIntegers(m, n));
	}
}


public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(m==0 || n==0){ // if any of them is 0 then ans is 0
            return 0;
        }
        if(m == 1){
            return n;
        }
        if(n == 1){
            return m;
        }
        if(m<n){ // n + add n (m-1) times
            return n + multiplyTwoIntegers(m-1, n);
        }else{   // m + add m (n-1) times
            return m + multiplyTwoIntegers(m, n-1);
        }
	
	}
}

