//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-23<p>
//-------------------------------------------------------

import java.util.Arrays;

public class IsAnagram {

    //字母个数一致
    public static boolean isAnagram1(String s, String t) {
        if (s == null && t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }
        return true;
    }
}