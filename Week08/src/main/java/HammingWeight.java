//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-02<p>
//-------------------------------------------------------

public class HammingWeight {

    //int 32位，按位&，1与当前位相&，则会得到最低位数字；依次左移循环，便可得到1的个数
/*    public static int hammingWeight(int n) {
        int count = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            mask = mask << 1;
        }

        return count;
    }*/


    //清零最低位 x= x&(x-1)
    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }


    public static void main(String[] args) {
        int input = 00000000000000000000000000001011;

        System.out.println("====>" + hammingWeight(input));
    }
}