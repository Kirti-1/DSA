import java.util.*;
public class PrintNumbers{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        Solution.print(n);
    }
}
class Solution{
    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.format(n + " ");
    }
}