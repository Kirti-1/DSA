import java.util.*;

class Solution{
    static Scanner scn = new Scanner(System.in);
    static int count = 0;
    public static int countNodes(TreeNode<Integer> root){
        for(int i=0;i<root.children.size();i++){
            count = 1 + countNodes(root.children.get(i));
        }
        return count;    
    }    
}
public class CountNodes{
    public static void main(String[] args){
        TreeNode<Integer> root = Solution.takeInputLevelWise();
        int c = Solution.countNodes(root);
        System.out.println(c);
    }
}