package ListMapTest;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("轿车","cari");
        map.put("新能源","1");
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> temp = new HashMap<>();
        for(String key : map.keySet()){
            String value = map.get(key);
            temp.put("value",key);
            temp.put("lable",value);
            list.add(temp);
            System.out.println(list);
        }
    }
}
