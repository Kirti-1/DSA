import java.util.*;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
    
}



class Main {
    static Scanner scn = new Scanner(System.in);
    public static void printBinaryTree(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " :");
        if(root.left!=null) {
            System.out.print("L" + root.left.data);
        }
        if(root.right!=null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput() {
        int rootData = scn.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> left = takeInput();
        BinaryTreeNode<Integer> right = takeInput();
        root.left = left;
        root.right = right;

        return root;
    }
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
                int isLeftChild = scn.nextInt();
                if(isLeftChild!=0){
                    int leftChild = scn.nextInt();
                    front.left = new BinaryTreeNode<Integer>(leftChild);
                    q.add(front.left);
                }
                int isRightChild = scn.nextInt();
                if(isRightChild!=0){
                    int rightChild = scn.nextInt();
                    front.right = new BinaryTreeNode<Integer>(rightChild);
                    q.add(front.right);
                }
            }
        }
        return root;

    }
    public static void main(String[] args){
        
        /*BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rl = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rr = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> rlr = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> rrl = new BinaryTreeNode<>(5);
        root.left = rl;
        root.right = rr;
        rl.right = rlr;
        rr.left = rrl;
        // 1 :L2R3
        // 2 :R4
        // 4 :
        // 3 :L5
        // 5 :
        */
        // BinaryTreeNode<Integer> root = takeInput(); // take input recursively 
        /*
        1
        2
        -1
        4
        -1
        -1
        3
        5
        -1
        -1
        -1
        1 :L2R3
        2 :R4
        4 :
        3 :L5
        5 :
        */
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        /*
        1 1 2 1 3 0 1 4 1 5 0 0 0 0 0
        1 :L2R3
        2 :R4
        4 :
        3 :L5
        5 :
        */
        printBinaryTree(root);        
        
    }
}