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
    
        System.out.println("Enter root data ");
        int rootData = scn.nextInt();
        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (pendingNodes.size() != 0) {
            BinaryTreeNode<Integer> front = pendingNodes.peek();
            pendingNodes.remove();
            System.out.println("Enter left child of " + front.data);
            int leftChildData = scn.nextInt();
            if (leftChildData != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChildData);
                front.left = child;
                pendingNodes.add(child);
            }
            System.out.println("Enter right child of " + front.data);

            int rightChildData = scn.nextInt();

            if (rightChildData != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChildData);
                front.right = child;
                pendingNodes.add(child);
            }
        }
        return root;

    }        
}


class DiaHeight { 
    int height;
    int diameter;
    DiaHeight(int height, int diameter){
        this.height = height;
        this.diameter = diameter;
    }
}
class Solution {
    public static DiaHeight Helper(BinaryTreeNode<Integer> root){
        // if(root.right != null || root.left != null){
        //     return new DiaHeight(1,1);
        // }
        if(root == null){
            return new DiaHeight(0,0);
        }
        DiaHeight lft = Helper(root.left);
        DiaHeight rgt = Helper(root.right);

        int oh = 1 + Math.max(lft.height, rgt.height);
        int od = Math.max((lft.height + rgt.height), Math.max(lft.diameter, rgt.diameter));
        return new DiaHeight(oh, od);
    }
    public static DiaHeight diameterOfBT(BinaryTreeNode<Integer> root){
        DiaHeight ans = Helper(root);
        // return Math.max(ans.height, ans.diameter);
        return ans;
    }
}

public class Diameter {
    public static void main(String[] args){
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeInputLevelWise();
        DiaHeight ans = Solution.diameterOfBT(root);
        System.out.println(ans.height + " " + ans.diameter);

    }
}