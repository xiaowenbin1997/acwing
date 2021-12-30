package lambdatest01;

import org.junit.Test;

public class ExerLambda01 {
    @Test
    public void testLambda() {
        FuncInter funcInter01 = new FuncInter() {
            @Override
            public Integer getResult(Integer num) {
                return ++num;
            }
        };
        FuncInter funcInter02 = x -> x * x;
        System.out.println(funcInter01.getResult(2));
        System.out.println(funcInter02.getResult(8));
    }
}
