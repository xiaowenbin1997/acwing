package listTest;

import java.util.ArrayList;
import java.util.List;

public class ListTestNull {
    public static void main(String[] args) {
        List<String> stringLists = new ArrayList<>();
        for (String temp : stringLists) {
            System.out.println(temp);
        }
    }

}
