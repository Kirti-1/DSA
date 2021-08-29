
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
        
            static int larger = Integer.MIN_VALUE;
            static int secondLarger = Integer.MIN_VALUE;
        
        public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Return output and don't print it.
            * Taking input and printing output is handled automatically.
            */
            if(root == null){
                return null;
            }
            
            
//             Queue<TreeNode<Integer>> q = new LinkedList<>();
            
//             q.add(root);
//             while(q.size()>0){
//                 int size = q.size();
//                 while(size-->0){
//                     TreeNode<Integer> front = q.peek();
//                     q.remove();
                    
//                     if(front.data>larger){
//                         secondLarger = larger;
//                         larger = front.data;
    
//                     }else if(front.data>secondLarger){
//                         secondLarger = front.data;
//                     }
//                     for(int i=0;i<front.children.size();i++){
//                         q.add(front.children.get(i));
//                     }
//                 }
//             }
//             if(secondLarger!=Integer.MIN_VALUE && secondLarger!=larger)
//             	return new TreeNode<Integer>(secondLarger);
//             return null;
            for(int i=0;i<root.children.size();i++){
                findSecondLargest(root.children.get(i));
            }
            if(root.data>larger){
                secondLarger = larger;
                larger = root.data;
            }else if(root.data>secondLarger){
                secondLarger = root.data;
            }
    
            if(secondLarger!=Integer.MIN_VALUE && secondLarger!=larger){
                return new TreeNode<Integer>(secondLarger);
            } return null;
        }
        
        
    }