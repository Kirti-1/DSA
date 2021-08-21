import java.util.*;

public class NumberOfDigits{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(Solution.numberOfDigits(n));
    }
}
class Solution{
    public static int numberOfDigits(int n){
        if(n == 0){
            return 0;
        }
        int odl = numberOfDigits(n/10); // one digit less
        return 1 + odl;
    }
}