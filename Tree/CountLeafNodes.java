
/***********************************************************************/

class Solution {
    public static int countLeafNodes(TreeNode<Integer> root) {
        if(root == null){
            return 0; // edge case and not base case
        }
        int count = 0;
        if(root.children.size() == 0){
            return 1;
        }
        for(int i=0;i<root.children.size();i++){
            count += countLeafNodes(root.children.get(i));
        }
        return count;
    }
}

public class CountLeafNodes {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        TreeNode<Integer> root = DriverCode.takeInputLevelWise();
        int leafNodes = Solution.countLeafNodes(root);
        System.out.println(leafNodes);

    }
}