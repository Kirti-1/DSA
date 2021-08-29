import java.util.*;
public class Solution {

    /*	TreeNode class 
     * 
     * class TreeNode<T> {
            T data;
            ArrayList<TreeNode<T>> children;
    
            TreeNode(T data){
                this.data = data;
                children = new ArrayList<TreeNode<T>>();
            }
        }*/
        
        public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Return output and don't print it.
            * Taking input and printing output is handled automatically.
            */
            if(root == null){
                return false;
            }
            if(root!=null && root.data == x){
                return true;
            }
            boolean ans = false;
            for(int i=0;i<root.children.size();i++){
                ans = checkIfContainsX(root.children.get(i), x);
                if(ans){ // Intermediate checking if true then return true always!
                    return ans;
                }
            }
            return ans;
    
        }
        
    }