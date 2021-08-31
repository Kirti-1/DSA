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
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int pi, int pe, int ii, int ie){
        if(pi >= preOrder.length || ii >= inOrder.length || pi>pe || ii>ie){
            return null;
        }
        int rootData = preOrder[pi];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        
              
        
        int rootIndex = ii; // length of left subtree   
        while(rootIndex<inOrder.length && inOrder[rootIndex]!=rootData){
            rootIndex++;
        }
        
        int ili = ii; // inorder left subtree initial
        int ile = rootIndex - 1; // inorder left subtree ending
        int pli = pi + 1; // pre order left subtree initial
        int ple = ile - ili + pli; // pre order left subtree ending
        int pri = ple + 1; // preorder right subtree initial
        int pre = pe; // preorder right subtree ending
        int iri = rootIndex + 1; // inorder right subtree initial
        int ire = ie; // inorder right subtree ending
       
        root.left = buildTree(preOrder, inOrder, pli, ple, ili, ile);
        root.right = buildTree(preOrder, inOrder, pri, pre, iri, ire);
        return root;
        
    }

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
        return root;
	}
    

}