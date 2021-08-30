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

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return ;
        }
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        int nodes = 1;
        while(q.size()>0){
            int size = q.size();
            while(size-->0){
                BinaryTreeNode<Integer> front = q.peek();
                q.remove();
                System.out.print(front.data  + ":");
                if(front.left!=null){
                	System.out.print("L:" + front.left.data + ",");
                	q.add(front.left);
                }else{
                	System.out.print("L:-1,");
                }
                if(front.right!=null){
                	System.out.print("R:" + front.right.data);
                    q.add(front.right);
                }else{
                	System.out.print("R:-1");
                }
                System.out.println();
                nodes++;
            }
        }
	}
	
}