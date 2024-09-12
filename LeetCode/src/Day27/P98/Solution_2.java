package Day27.P98;

import java.util.ArrayList;
import java.util.List;

public class Solution_2 {
    List<Integer> list = new ArrayList<>();
    public void travesal(TreeNode root) {
        if (root == null) return;
        travesal(root.left);
        list.add(root.val);
        travesal(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        travesal(root);
        return isadd(list);
    }
    public boolean isadd(List<Integer> list) {
        if (list.size() == 0&&list.size()==1) return true;
        int min = list.get(0);
        for (int i=1;i<list.size();i++){
            if (min>list.get(i)){
                return false;
            }
        }
        return true;
    }
}
