package lambdaExer;

public class TestLambda02 {
    public static void main(String[] args) {
        OperateLong<Long,Long> operate = (Long num1, Long num2) -> {return num1 * num2;};
        System.out.println(operate.operateNum(100L,200L));
    }
}
