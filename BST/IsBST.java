import java.util.*;
/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

public class Solution {
	static ArrayList<Integer> inorder = new ArrayList<>();
    public static void inOrder(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        inorder.add(root.data);
        inOrder(root.right);
    }
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        inOrder(root);
        for(int i=1;i<inorder.size();i++){
            if(inorder.get(i-1)>inorder.get(i)){
                return false;
            }
        }
        return true;      
	}

}