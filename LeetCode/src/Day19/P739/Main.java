package Day19.P739;

public class Main {
    public static void main(String[] args) {
        int []temperatures={73,74,75,71,69,72,76,73};
        Solution solution = new Solution();
        int []res=solution.dailyTemperatures(temperatures);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
