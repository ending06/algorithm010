//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-07-04<p>
//-------------------------------------------------------

public class LemonadeChange {


    //题目中，只有5,10,20三种币
    //5元不找零
    //10元，找一张5块
    //20元，找10+5；5+5+5
    public static boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return false;
        }

        int fiveCount = 0;

        int tenCount = 0;
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5:
                    //如果是5块，直接收了
                    fiveCount++;
                    break;
                case 10:
                    //如果是10块，只能找零5块，若没有，则返回失败
                    if (fiveCount == 0) {
                        return false;
                    }
                    //此时手里少一张5块
                    fiveCount--;
                    //多了一张10块
                    tenCount++;
                    break;
                case 20:
                    //手里有10块，5块，则优先按照最大金额给找；
                    if (fiveCount >= 1 && tenCount >= 1) {
                        fiveCount--;
                        tenCount--;
                        break;
                    }
                    //如果没有10块，则找零3张5块
                    if (fiveCount >= 3) {
                        fiveCount = fiveCount - 3;
                        break;
                    }
                    //都不满足，则失败
                    return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] input = new int[]{5, 5, 10};

        boolean result = lemonadeChange(input);

        System.out.println("===>" + result);
    }
}