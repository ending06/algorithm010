//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-08-16<p>
//-------------------------------------------------------

public class NumDecodings {

    public static int numDecodings(String s) {
//        System.out.println("===>"+s);

        int returnSub1 = check(String.valueOf(s.charAt(0)));

        int returnSub2 = 0;

        if (s.length() >= 2) {

            returnSub2 = check(s.substring(0, 2));
        }

        int result1 = 0;
        if (returnSub1 > 0) {
            if(s.length()==1){
                result1=1;
            }else{
                result1 = numDecodings(s.substring(1, s.length()));
            }
        }


        int result2 = 0;
        if (returnSub2 > 0) {
            if (s.length()==2) {
                result2 = 1;
            }else{
                result2 = numDecodings(s.substring(2, s.length()));
            }
        }

//        if (result1 == 0 || result2 == 0) {
//            return 0;
//        }

//        if (result3 == 0 || result4 == 0) {
//            return 0;
//        }

        return result1 + result2;
    }

    private static int check(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        //长度是1位，return 1
        if (s.length() == 1) {
            if (s.equals("0")) {
                return 0;
            } else {
                return 1;
            }
        }
        //长度大于2位，一个字母只能占1位；或者2位
        if (s.length() == 2) {
            Integer value = Integer.parseInt(s);
            if (value > 26) {
                return 0;
            } else if (s.equals("00")) {
                return 0;
            } else if (s.charAt(s.length() - 1) == '0') {
                return 1;

            } else {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        String s = "226";
        int result = numDecodings(s);
        System.out.println("===>" + result);
    }
}