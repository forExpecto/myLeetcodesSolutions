package Day14.P20;

public class Main {
    public static void main(String[] args) {
        String str="{}()";
        String str1="{()}";
        String str2="{(})";
        Solution solution=new Solution();
        System.out.println(solution.isValid(str));
        System.out.println(solution.isValid(str1));
        System.out.println(solution.isValid(str2));
    }
}
