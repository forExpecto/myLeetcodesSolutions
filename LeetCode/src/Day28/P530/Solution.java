package Day28.P530;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int res=Integer.MAX_VALUE;
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        for(int i=0;i<list.size()-1;i++){
            res=Math.min(res,Math.abs(list.get(i)-list.get(i+1)));
        }
        return res;
    }
    public void traverse(TreeNode root) {
        if(root==null) return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }

}
