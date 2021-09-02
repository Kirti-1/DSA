import java.util.*;
class BinaryTreeNode<T> { 
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
    static Scanner scn = new Scanner(System.in);
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
    int rootData = scn.nextInt();
    if(rootData == -1){
        return null;
    }
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

    Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
    q.add(root);
    while(q.size()>0){
        int size = q.size();
        while(size-->0){
            BinaryTreeNode<Integer> front = q.peek();
            q.remove();
            int leftChild = scn.nextInt();
            if(leftChild!=-1){
                front.left = new BinaryTreeNode<Integer>(leftChild);
                q.add(front.left);
            }
            int rightChild = scn.nextInt();
            if(rightChild!=-1){
                front.right = new BinaryTreeNode<Integer>(rightChild);
                q.add(front.right);
            }
        }
    }
    return root;
    }

    
}

class Solution {
    public static int minimum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }
    public static int maximum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
    public static boolean isBST2(BinaryTreeNode<Integer> root) {
        if(root == null){
            return true;
        }
        int max = minimum(root.left); // making this recursive call again and again
        int min = maximum(root.right);
  
        boolean output = root.data>max && root.data<=min && isBST2(root.left) && isBST2(root.right);
        return output;
    }
}

class IsBST2 {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeInputLevelWise();
        System.out.print(Solution.isBST2(root));

    }
}