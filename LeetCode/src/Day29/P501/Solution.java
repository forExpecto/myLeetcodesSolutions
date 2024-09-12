package Day29.P501;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Solution {
    Map<Integer, Integer> map=new HashMap<>();
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else map.put(root.val,1);
        traverse(root.right);
    }
    public int[] findMode(TreeNode root) {
        traverse(root);
        int max=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();

}
