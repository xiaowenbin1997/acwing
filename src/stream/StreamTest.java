package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc","efg","","啊");
        List<String> filterString = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        Random random = new Random();
        random.ints().limit(6).forEach(System.out::println);

    }
}
