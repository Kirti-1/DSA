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
        
        public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Return output and don't print it.
            * Taking input and printing output is handled automatically.
            */
            if(root1.children.size()!=root2.children.size()){ // sub tree size constraint needs to be also considered
                return false;
            }
            if(root1!=null && root2!=null && root1.data!=root2.data){
                return false;
            }
            for(int i=0;i<root1.children.size() && i<root2.children.size();i++){
                boolean ans = checkIdentical(root1.children.get(i), root2.children.get(i));
                if(!ans){
                    return false;
                }
            }
            return true;
    
        }
        
    }