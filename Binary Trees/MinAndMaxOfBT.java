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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Pair<Integer, Integer> lft = getMinAndMax(root.left);
        Pair<Integer, Integer> rgt = getMinAndMax(root.right);
        
        int min = Math.min(lft.minimum, rgt.minimum);
        int max = Math.max(lft.maximum, rgt.maximum);
        if(min>root.data){
            min = root.data;
        }
        if(max<root.data){
            max = root.data;
        }
        
        return new Pair(min, max);
	}
	
}