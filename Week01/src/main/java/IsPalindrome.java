public class IsPalindrome {

    // 帅选+判断，将字母和数字筛选出来，组成一个新的字符串，之后再进行比对
    public static boolean isPalindrome1(String s) {
        StringBuffer sgood = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }

        // 反转字符串，直接调用库函数
        StringBuffer reverseStr = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(reverseStr.toString());
    }

    // 双指针方式
    public static boolean isPalindrome2(String s) {
        // 字符串比对只保留字母和数字，构建新的字符串，空间复杂度是O(s)
        StringBuffer newStr = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                newStr.append(Character.toLowerCase(ch));
            }
        }

        // 双指针
        int left = 0, right = newStr.length() - 1;

        while (left < right) {
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    // 双指针,直接在原来的字符串上进行比对
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while ((left < right) && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while ((left < right) && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }

            if (left < right){
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));
    }
}