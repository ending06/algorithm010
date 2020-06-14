//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

public class Trap {

    public int trap(int[] height) {
        //取当前柱子的左边最大，右边最大，减去柱子的高度
        if (height == null || height.length == 0) {
            return 0;
        }
        int sum = 0;
        int length = height.length;
        for (int i = 0; i < length - 1; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < length; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            sum = sum + Math.min(maxLeft, maxRight) - height[i];
        }
        return sum;
    }
}