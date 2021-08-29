
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
        static int count = 0;
        public static int numNodeGreater(TreeNode<Integer> root,int x){
            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Return output and don't print it.
            * Taking input and printing output is handled automatically.
            */
            if(root == null){ // edge case and not a base case
                return 0;
            }
            if(root.data > x){
                count = 1;
            }
            for(int i=0;i<root.children.size();i++){
                count += numNodeGreater(root.children.get(i), x);
            }
            
            return count;    
        }
        
    }
