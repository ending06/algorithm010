//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-07-26<p>
//-------------------------------------------------------

public class ClimbStairs {
/*    //递归，会超时
    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }*/

// 将临时计算结果存储，最后直接取数组中记录值
/*    public static int climbStairs(int n) {
        int[] result = new int[n + 1];
        return recordClimbStairs(n, result);
    }

    private static int recordClimbStairs(int n, int[] result) {
        //已经计算过方法数
        if (result[n] > 0) {
            return result[n];
        }

        if (n == 1) {
            result[n] = 1;
        } else if (n == 2) {
            result[n] = 2;
        } else {
            result[n] = recordClimbStairs(n - 1, result) + recordClimbStairs(n - 2, result);
        }
        return result[n];
    }*/


    //dp
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}