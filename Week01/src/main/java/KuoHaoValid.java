//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-23<p>
//-------------------------------------------------------

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class KuoHaoValid {

    public static boolean isValid(String s) {
        int n = s.length();

        //非成对出现
        if (n % 2 == 1) {
            return false;
        }

        final Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        LinkedList<Character> stack = new LinkedList<Character>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String ss = "()[]{}";
        System.out.println("====>"+isValid(ss));
    }
}