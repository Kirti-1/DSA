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

	public static int numOfNodes(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int num = numOfNodes(root.left) + numOfNodes(root.right);
        return 1 + num;
    }
	
}