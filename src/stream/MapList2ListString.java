package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapList2ListString {
    public static void main(String[] args) {
        List<Map<String,Object>> mapList = new ArrayList<>();
        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("急了", "差不多", "3");
        List<String> list3 = Arrays.asList("尬住", "这下", "1","寄");
        Map<String,Object> tag01 = new HashMap<>();
        Map<String,Object> tag02 = new HashMap<>();
        Map<String,Object> tag03 = new HashMap<>();
        tag01.put("tags",list1);
        tag02.put("tags",list2);
        tag03.put("tags",list3);
        mapList.add(tag01);
        mapList.add(tag02);
        mapList.add(tag03);
        List<String> tagList = new ArrayList<>();
        mapList.stream().map(i -> getListString("tags",i)).collect(Collectors.toList());
        mapList.stream().map(i -> getListString("tags",i)).flatMap(u -> u.stream()).collect(Collectors.toList());
        mapList.stream().map(i -> getListString("tags",i)).flatMap(u -> u.stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapList.stream().map(i -> getListString("tags",i)).map(u -> u.stream()).collect(Collectors.toList());
        mapList.stream().collect(Collectors.groupingBy(i -> getListString("tags",i)));
    }
    private static List<String> getListString(String key,Map<String,Object> temp) {
        List<String> stringList = (List<String>) temp.get(key);
        return stringList;
    }
}
