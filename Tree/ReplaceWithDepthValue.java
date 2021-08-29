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
        
        public static void replaceWithDepthValue(TreeNode<Integer> root){
            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.
            */
            Queue<TreeNode<Integer>> q = new LinkedList<>();
            
            q.add(root);
            int level = 0;
            while(q.size()>0){
                int size = q.size();
                while(size-->0){
                    
                    TreeNode<Integer> front = q.peek();
                    q.remove();
                    front.data = level;
                    for(int i=0;i<front.children.size();i++){
                        q.add(front.children.get(i));
                    }                    
                }
                level++;
                System.out.println();
            }
            
        }
        
        
    }