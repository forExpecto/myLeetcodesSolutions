package Day2.P59;

class Solution {

    int num=1;
    public int[][] generateMatrix(int n) {
        if(n==1) {
            int[][] ans = {{1}};
            return ans;
        }
        int[][] ans=new int[n][n];//数组初始化
        int circle=n/2;//表示走几圈
        int var=n-1;//表示每次前进几格
        int row=0,col=0;//表示每次前进时的行和列

        while (circle>0){
            //从左到右
            for (int i=0;i<var  ;i++) {
                ans[row][col]=num++;
                col++;
            }

            //从上到下
            for (int i=0;i<var ;i++) {
                ans[row][col]=num++;
                row++;
            }

            //从右到左
            for (int i=0;i<var ;i++) {
                ans[row][col]=num++;
                col--;
            }

            //从下到上
            for (int i=0;i<var ;i++) {
                ans[row][col]=num++;
                row--;
            }
            row++;
            col++;
            //前进步数减一
            var-=2;
            if(num==n*n){
                int mid=n/2;
                ans[mid][mid]=num;
                break;
            }
            circle--;
        }
        return ans;
    }


}