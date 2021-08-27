import java.util.*;
class TreeNode<T>{
    T data; // = 0
    ArrayList<TreeNode<T>> children; // = null (null reference)
    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>(); // initialze it before accessing it.
    }
}
class DriverCode{
    static Scanner scn = new Scanner(System.in);
    public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(pendingNodes.size()>0){
            int size = pendingNodes.size();
            while(size-->0){
                TreeNode<Integer> pn = pendingNodes.peek();
                pendingNodes.remove();
                System.out.print(pn.data+":");
                TreeNode<Integer> child;
                for(int i=0;i<pn.children.size()-1;i++){
                    child = pn.children.get(i);
                    System.out.print(child.data+",");
                    pendingNodes.add(child);
                }
                if(pn.children.size()>0){
                    child = pn.children.get(pn.children.size()-1);
                    System.out.print(child.data);
                    pendingNodes.add(child); 
                }
                System.out.println();                 
            }
        }
    }
    public static TreeNode<Integer> takeInputLevelWise(){
        // level input using arraylist and queue can be implemented easily.
        int data = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while(pendingNodes.size()>0){
            int size = pendingNodes.size();
            while(size-->0){
                TreeNode<Integer> pn = pendingNodes.peek();
                pendingNodes.remove();
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
    }
}

/********************************************************************/

class Solution {
    static int sum = 0;
    public static int sumOfNodes(TreeNode<Integer> root){

        sum = root.data;
        for(int i=0;i<root.children.size();i++){
            sum += sumOfNodes(root.children.get(i));
        }
        return sum;
    }

}
public class SumOfNodes{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        TreeNode<Integer> root = DriverCode.takeInputLevelWise();
        System.out.println(Solution.sumOfNodes(root));
        DriverCode.printLevelWise(root);
    }
}