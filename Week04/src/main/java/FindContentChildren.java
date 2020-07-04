//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-07-04<p>
//-------------------------------------------------------

import java.util.Arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s) {
        if (g == null || g.length == 0 || s == null || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);

        int findChildren = 0;

        //初始化操作起始位置
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {

            //当前饼干满足当前小孩
            if (g[i] <= s[j]) {
                findChildren = findChildren + 1;
                i++;
                j++;
            } else {
                //不满足，饼干继续向后找
                j++;
            }
        }
        return findChildren;
    }

    public static void main(String[] args) {
        int[] chs = new int[]{1, 2, 3};
        int[] foods = new int[]{1, 1};
        int result = findContentChildren(chs, foods);
        System.out.println("==>" + result);
    }
}