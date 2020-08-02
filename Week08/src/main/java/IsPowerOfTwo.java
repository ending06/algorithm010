//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-02<p>
//-------------------------------------------------------

public class IsPowerOfTwo {

    //轮询/2；
/*    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }*/

    //2的幂次方只有一个1
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        long x = (long) (n);
        return (x & (x - 1)) == 0;
    }


    public static void main(String[] args) {
        System.out.println("====>" + isPowerOfTwo(16));
    }
}