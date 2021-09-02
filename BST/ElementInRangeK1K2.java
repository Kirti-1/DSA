public class Solution {

/*	Binary Tree Node class 
    * 
    * 	class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        
        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    */
    
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data<=k2 && root.data>=k1){
            // both left and right call
            elementsInRangeK1K2(root.left, k1, k2);
            // print the root's data after the return of right subtree, to print the answer in increasing order.
            System.out.print(root.data + " ");
            elementsInRangeK1K2(root.right, k1, k2);
        }
        // call making time
        if(root.data>k2){
            // call to left subTree
            elementsInRangeK1K2(root.left, k1, k2);
        }
        else if(root.data<k1){
            // call to right sub tree
            elementsInRangeK1K2(root.right, k1, k2);
        }else{
            return;
        }
        
    }
    
    
}