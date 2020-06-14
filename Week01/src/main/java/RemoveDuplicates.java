//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums.length;
        }
        Arrays.sort(nums);

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }


    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 1, 2};

        int result = removeDuplicates(inputArray);

        System.out.println("===>" + result);
    }
}