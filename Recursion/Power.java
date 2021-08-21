import java.util.*;

public class Power{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(Solution.power(x,n));
    }
}
class Solution{
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int smallerProblem = power(x, n/2);
        if(n%2 == 0){
            return smallerProblem * smallerProblem;
        }return x * smallerProblem * smallerProblem;
    }
}