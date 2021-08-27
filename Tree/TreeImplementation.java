import java.util.*;
class TreeNode<T>{
    T data; // = 0
    ArrayList<TreeNode<T>> children; // = null (null reference)
    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>(); // initialze it before accessing it.
    }
}
public class TreeImplementation{
    static Scanner scn = new Scanner(System.in);
    public static TreeNode<Integer> takeInputLevel(){
        // level input using arraylist and queue can be implemented easily.
        int data = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        ArrayList<TreeNode<Integer>> pendingNodes = new ArrayList<>();
        pendingNodes.add(root);

        while(pendingNodes.size()>0){
            int size = pendingNodes.size();
            while(size-->0){
                TreeNode<Integer> pn = pendingNodes.get(0);
                pendingNodes.remove(0);
                int n = scn.nextInt(); // number of childrens of pn
                for(int i=0;i<n;i++){
                    int childData = scn.nextInt();
                    TreeNode<Integer> child = new TreeNode<>(childData);
                    pn.children.add(child);
                    pendingNodes.add(child);
                }
            }
        }
        return root; 
        /*
        input: 
        10 2 20 50 2 30 40 2 60 70 0 0 0 0
        output:
        10 - 20 50 
        20 - 30 40
        30 -
        40 -
        50 - 60 70
        60 -
        70 - 
        */
    }
    public static TreeNode<Integer> takeInput(){
        int data = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    public static void printTree(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " - ");
        for(int i=0;i<root.children.size();i++){
            System.out.print((root.children.get(i)).data + " ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }
        /*
        Have to pass the input data carefully.
        input:
        10 2 20 2 30 0 40 0 50 2 60 0 70 0
        output:
        10 - 20 50 
        20 - 30 40
        30 -
        40 -
        50 - 60 70
        60 -
        70 -
        */
    }

    public static void main(String[] args){
        /*
        TreeNode<Integer> root  = new TreeNode<>(10);
        TreeNode<Integer> node1 = new TreeNode<>(20);
        TreeNode<Integer> node2 = new TreeNode<>(30);
        (root.children).add(node1);
        (root.children).add(node2);
        */
        // TreeNode<Integer> root  = takeInput();
        TreeNode<Integer> root  = takeInputLevel();
        printTree(root);
        /*
        System.out.format("%d - ",root.data);
        for(int i=0;i<root.children.size();i++){
            System.out.print((root.children.get(i)).data + " ");
        }
        */        
    }
}