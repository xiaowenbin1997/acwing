package javaTest03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArray {
    public static void main(String[] args) {
        String input = "spider_cooperative_hospital_1,spider_cooperative_hospital_1_num,cooperative_hospital_1,cooperative_hospital_1_num";
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(input.split(",")));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            stringBuilder.append("\"" + strings.get(i) + "\"");
            if (i != strings.size() - 1) {
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder);
    }
}
