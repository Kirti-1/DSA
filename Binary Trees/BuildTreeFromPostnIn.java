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
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int pi, int pe, int ii, int ie){
        if(pi>pe || ii>ie){
            return null;
        }
        int rootData = postOrder[pe];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex = ii;
        while(rootIndex<inOrder.length && inOrder[rootIndex] != rootData){
            rootIndex++;
        }
        int ili = ii;
        int ile = rootIndex - 1;
        int pli = pi;
        int ple = ile - ili + pli;
        int pri = ple + 1;
        int pre = pe - 1;
        int iri = rootIndex + 1;
        int ire = ie;
        
        root.left = buildTree(postOrder, inOrder, pli, ple, ili, ile);
        root.right = buildTree(postOrder, inOrder, pri, pre, iri, ire);
        
        return root;
    }

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0, postOrder.length-1, 0, inOrder.length-1);
        return root;
	}

}