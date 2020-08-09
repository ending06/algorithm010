import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {

    //方法1：循环计数遍历
    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.get(c) == null ? 1 : count.get(c) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }

    //方法2： 如果都是小写字母，则最多26个英文字母；当字符串特别长的时候，可以优化下

    public static void main(String[] args) {
        System.out.println("===>"+firstUniqChar("leetcode"));
    }
}