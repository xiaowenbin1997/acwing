package dealwithstring;

import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DealString {
    @Test
    public void test01() {
        Map<String, Integer> strCount = new HashMap<>();
        strCount.put("张三",0);
        strCount.put("李四",1);
        strCount.put("王五",2);
        strCount.put("赵六",3);
        Set<Map.Entry<String, Integer>> entries = strCount.entrySet();
        entries.forEach(System.out::println);
    }
}
