
/********************************************************************/

class Solution {
    public static void printAtKLevel(TreeNode<Integer> root, int k){
        if(root == null){
            return; // not a base case but an edge case
        }
        if(k == 0){
            System.out.print(root.data + " ");
        }
        for(int i=0;i<root.children.size();i++){
            printAtKLevel(root.children.get(i), k-1);
        }
    }
}

public class PrintAtLevelK {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        TreeNode<Integer> root = DriverCode.takeInputLevelWise();
        int k = scn.nextInt();
        Solution.printAtKLevel(root, k);
    }
}