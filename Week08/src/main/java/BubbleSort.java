//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-03<p>
//-------------------------------------------------------

public class BubbleSort {
    //嵌套循环，相邻两个元素，如果逆序，则交换顺序
    public static void bubble(int[] a, int n) {
        for (int i = 0; i < n-1; i++) {

            //如果大于，则交换位置, 最终最后一位则是当前数组最大值
            if (a[i] > a[i+1]){
                int temp = a[i]; a[i] = a[i + 1]; a[i + 1] = temp;
            }
        }
    }

    public static void bubbleSort(int[] a, int n) {
        for (int i = n; i >= 1; i--) {
            bubble(a, i);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{9,6,1,4,8,7,2};
        bubbleSort(input,input.length);
        System.out.println("====>"+input);
    }
}