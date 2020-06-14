//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

public class Rotate {

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 0) {
            return;
        }

        int[] tempArray = new int[nums.length];

        //暴力解决
        for (int i = 0; i < k; i++) {
            int moveValue = nums[nums.length - 1];

            for (int j = 0; j <nums.length; j++) {

                int temp = nums[j];

                nums[j] = moveValue;

                moveValue = temp;

            }
        }
    }


    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};

        int k = 2;

        rotate(input, k);

        System.out.println("===>" + input);
    }
}