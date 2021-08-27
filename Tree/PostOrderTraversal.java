
/***************************************************************************/

class Solution {
    public static void postOrderTraversal(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        for(int i=0;i<root.children.size();i++){
            postOrderTraversal(root.children.get(i));
        }
        System.out.print(root.data + " ");
	}
}

public class PostOrderTraversal {
    public static void main(String[] args){
        TreeNode<Integer> root = DriverCode.takeInputLevelWise();
        Solution.postOrderTraversal(root);
    }
}