//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-06-14<p>
//-------------------------------------------------------

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits == null) {
            return digits;
        }
        int ci = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int value = 0;
            if (i == digits.length - 1) {
                value = (digits[i] + 1 + ci) % 10;
                ci = (digits[i] + 1 + ci) / 10;
            } else {
                value = (digits[i] + ci) % 10;
                ci = (digits[i] + ci) / 10;
            }
            digits[i] = value;
        }
        if (ci == 0) {
            return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = ci;
        for (int i = 0; i < digits.length; i++) {
            result[i + 1] = digits[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3};

        int[] result = plusOne(input);

        System.out.println("===>" + result);
    }
}