package Day25.P513;

import org.w3c.dom.Node;

public class Solution_2 {
    int maxdepth=Integer.MIN_VALUE;
    int result;
    public void traverse(TreeNode root,int depth) {
        if(root.left==null&&root.right==null) {
            if(depth>maxdepth) {
                maxdepth=depth;
                result=root.val;
            }
            return;
        };
        if(root.left!=null)traverse(root.left,depth+1);
        if(root.right!=null)traverse(root.right,depth+1);
    }
    public int findBottomLeftValue(TreeNode root){
        traverse(root,0);
        return result;
    }
}
