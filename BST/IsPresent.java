public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root == null){
            return false;
        }
        if(root.data == k){
            return true;
        }
        boolean isPresentLft = searchInBST(root.left, k);
        boolean isPresentRgt = searchInBST(root.right, k);
        return isPresentLft || isPresentRgt;
		
	}
}