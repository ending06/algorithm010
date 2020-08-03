//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-03<p>
//-------------------------------------------------------

public class InsertionSort {

    //将未排好序的数字，插入到已排好的顺序中

    // n :第N个数字
    public static void insert(int[] a, int n) {
        int key = a[n];

        int i = n;

        while (a[i - 1] > key) {
            a[i] = a[i - 1];
            i--;
            if (i == 0) {
                break;
            }
        }
        a[i] = key;
    }

    public static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            insert(a, i);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 6, 7, 4, 2, 1, 5};
        insertionSort(input, 7);
        System.out.println("====>" + input);
    }
}