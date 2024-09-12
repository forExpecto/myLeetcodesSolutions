package Day22.P257;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public void travel(TreeNode node,List<Integer> paths,List<String> ans){
        paths.add(node.val);
        if(node.left == null && node.right == null){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<paths.size()-1;i++){
                sb.append(paths.get(i)).append("->");
            }
            sb.append(paths.get(paths.size()-1));
            ans.add(sb.toString());
            return;
        }
        if(node.left != null){
            travel(node.left,paths,ans);
            paths.remove(paths.size()-1);
        }
        if(node.right != null){
            travel(node.right,paths,ans);
            paths.remove(paths.size()-1);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> paths = new ArrayList<>();
        travel(root,paths,res);
        return res;
    }
}
