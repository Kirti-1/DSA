import java.util.*;

/******************************************************************************/

class Solution {
    public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root){ 
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
              * Taking input and printing output is handled automatically.
            */
            int max = root.data;
            TreeNode<Integer> maxNode = root;
            for(int i=0;i<root.children.size();i++){
                TreeNode<Integer> tempMaxNode = maxDataNode(root.children.get(i));
                if(maxNode.data < tempMaxNode.data){
                    maxNode = tempMaxNode;
                }
            }
            return maxNode;
    
        }
}

public class MaxDataNode {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        TreeNode<Integer> root = DriverCode.takeInputLevelWise();
        TreeNode<Integer> maxNode = Solution.maxDataNode(root);
        System.out.println(maxNode.data);

    }

}