package Day15.P150;

public class Main {
    public static void main(String[] args) {
        String []strs1={"2","1","+","3","*"};
        String []strs2={"4","13","5","/","+"};
        String []strs3={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution solution=new Solution();
        System.out.println(solution.evalRPN(strs1));
        System.out.println(solution.evalRPN(strs2));
        System.out.println(solution.evalRPN(strs3));
    }
}
