//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

public class MergeTwoArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //总长度
        int i = m + n - 1;
        int p = m - 1;
        int q = n - 1;

        while (p >= 0 && q >= 0) {
            if (nums1[p] < nums2[q]) {
                nums1[i] = nums2[q];
                q--;
                i--;
            } else if (nums1[p] > nums2[q]) {
                nums1[i] = nums1[p];
                p--;
                i--;
            } else {
                nums1[i] = nums2[q];
                nums1[i - 1] = nums1[p];
                q--;
                p--;
                i = i - 2;
            }
        }

        while (p < 0 && q >= 0) {
            nums1[i] = nums2[q];
            i--;
            q--;
        }

    }


    public static void main(String[] args) {
        int[] m = new int[]{1, 2, 3, 0, 0, 0};

        int[] n = new int[]{2, 5, 6};


        merge(m, 3, n, 3);

        System.out.println("===>"+m);
    }
}