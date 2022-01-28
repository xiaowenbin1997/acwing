package listTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void testList() {
        List<String> mainList = new ArrayList<String>(Arrays.asList("新浪","百度","谷歌"));
        List<String> subList = new ArrayList<String>(subList = Arrays.asList("新浪"));
        boolean b = mainList.removeAll(subList);
        for (String str : mainList) {
            System.out.println(str);
        }
    }
}
