//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-03<p>
//-------------------------------------------------------

public class SelectionSort {
    //每次选出最大的，和当前排查的数据段的最后一个位置交换
    public static int findMaxPos(int[] a, int n) {
        int max = a[0];
        int maxPos = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxPos = i;
            }
        }
        return maxPos;
    }

    public static void selectSort(int[] a, int n) {
        if (a == null || n <= 1) {
            return;
        }

        while(n>1){
            int maxPos = findMaxPos(a,n);
            int temp = a[maxPos]; a[maxPos] = a[n-1]; a[n-1] = temp;
            n--;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{9,6,1,4,8,7,2};
        selectSort(input,7);
        System.out.println("====>"+input);
    }
}