package Day17.P347;

public class Main {
    public static void main(String[] args) {
        int []nums = {1,2};
        Solution solution = new Solution();
        int[]num=solution.topKFrequent(nums,2);
        for (int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");
    }
}
