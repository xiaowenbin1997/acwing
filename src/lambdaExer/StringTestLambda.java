package lambdaExer;

import java.util.Locale;

class TestLambda implements OperateString {
    @Override
    public String getValue(String str) {
        char start = (char)(str.charAt(0) - 'a' + 'A');
        return start + str.substring(1,str.length());
    }
}

public class StringTestLambda {
    public static void main(String[] args) {
        TestLambda testLambda = new TestLambda();
        OperateString testLambda1 = str -> {
            char[] alphas = str.toCharArray();
            alphas[0] = (char)(alphas[0] + ('A' - 'a'));
            return String.valueOf(alphas);
        };
        OperateString operateString = str -> str.substring(2,4);
        String str = "hello";
        String newStr = testLambda.getValue(str);
        System.out.println(newStr);
        String newStr01 = operateString.getValue(str);
        System.out.println(newStr01);
    }
}
