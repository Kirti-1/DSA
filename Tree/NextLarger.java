import java.util.*;
public class Solution {

/*TreeNode structure 
* 
* class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}*/
    
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */
        int nextLarger = Integer.MAX_VALUE;
        TreeNode<Integer> nln = null; // next Larger Node 
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            while(size-->0){
                TreeNode<Integer> front = q.peek();
                q.remove();
                if(front.data > n && front.data<nextLarger){
                    nextLarger = front.data;
                    nln = front;
                }
                for(int i=0;i<front.children.size();i++){
                    q.add(front.children.get(i));
                }
            }
        }
        return nln;

    }
    
}