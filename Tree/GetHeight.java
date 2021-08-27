import java.util.*;
/**************************************************************************/
class Solution{
    public static int getHeight(TreeNode<Integer> root){
        /* Your class should be named Solution
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Return output and don't print it.
        * Taking input and printing output is handled automatically.
        */
        // Ask each and every children node to get their respective maximum height.
        int height = 0;
        for(int i=0;i<root.children.size();i++){
            int temp = getHeight(root.children.get(i));
            if(temp>height){
                height = temp;
            }
        }
        return 1 + height;
    }

}

public class GetHeight{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        TreeNode<Integer> root = DriverCode.takeInputLevelWise();
        System.out.println(Solution.getHeight(root));
    }
}
