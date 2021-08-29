import java.util.*;
public class Solution {

    /*	TreeNode structure 
     * 
     * class TreeNode<T> {
            T data;
            ArrayList<TreeNode<T>> children;
    
            TreeNode(T data){
                this.data = data;
                children = new ArrayList<TreeNode<T>>();
            }
        }*/
        public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
            
            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Return output and don't print it.
            * Taking input and printing output is handled automatically.
            */
            Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
            pendingNodes.add(root);
            TreeNode<Integer> maxNode = root;
            int max = Integer.MIN_VALUE;
            while(pendingNodes.size()>0){
                int size = pendingNodes.size();
                while(size-->0){
                    TreeNode<Integer> front = pendingNodes.peek();
                    pendingNodes.remove();
                    int sum = 0;
                    for(int i=0;i<front.children.size();i++){
                        TreeNode<Integer> child = front.children.get(i);
                        sum += child.data;
                        pendingNodes.add(child);
                    }
                    if(sum > max){
                        max = sum;
                        maxNode = front;
                    }
                }
            }
            return maxNode;
            
        }
        
    }