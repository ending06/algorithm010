//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-09<p>
//-------------------------------------------------------

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class ReverseWord {

    //1:调用现成的api直接操作reverse
    public static String reverseWords1(String s) {

        // 除去开头和末尾的空白字符
        s = s.trim();

        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < wordList.size(); i++) {
            if (i == (wordList.size() - 1)) {
                stringBuffer.append(wordList.get(i));
            } else {
                stringBuffer.append(wordList.get(i)).append(" ");
            }
        }
        return stringBuffer.toString();
    }

    //双端队列
    public static String reverseWords(String s) {

        int left = 0, right = s.length() - 1;
        // 去掉字符串开头的空白字符
        while (left <= right && s.charAt(left) == ' ') ++left;

        // 去掉字符串末尾的空白字符
        while (left <= right && s.charAt(right) == ' ') --right;

        Deque<String> d = new ArrayDeque();
        StringBuilder word = new StringBuilder();

        while (left <= right) {
            char c = s.charAt(left);
            if ((word.length() != 0) && (c == ' ')) {
                // 将单词 push 到队列的头部
                d.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            ++left;
        }
        d.offerFirst(word.toString());

        StringBuffer stringBuffer = new StringBuffer();


        Iterator iterator = d.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            stringBuffer.append(element).append(" ");
        }
        return stringBuffer.toString().substring(0,stringBuffer.length()-1);
    }


    public static void main(String[] args) {
        String aa = "the sky is blue";
        String result = reverseWords(aa);
        System.out.println("===>" + result);
    }
}