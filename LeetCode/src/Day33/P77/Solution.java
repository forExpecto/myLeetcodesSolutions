package Day33.P77;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n,k,1);
        return res;
    }

    public void backTracking(int n,int k,int index){
        if(index == k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<n;i++){
            list.add(i);
            backTracking(n,k,index + 1);
            list.remove(list.size()-1);
        }
    }
}