//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-09<p>
//-------------------------------------------------------

public class LongestPalindrome {

    //copy官方代码
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = isPalindRome(s, i, i);

            int length2 = isPalindRome(s, i, i + 1);

            int len = Math.max(length1, length2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int isPalindRome(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}