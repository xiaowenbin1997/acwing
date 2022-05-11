package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList("abc","efg","","啊");
//        List<String> filterString = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
//        Random random = new Random();
//        random.ints().limit(6).forEach(System.out::println);
        List<String> numStr = Arrays.asList("a", "b", "c");
        System.out.println("hello".concat(" world"));
        String result1 = numStr.stream().reduce("", (tempStr, tempChar) -> tempStr.concat(tempChar));
        String result2 = numStr.stream().reduce("", (tempStr, tempChar) -> tempStr + tempChar);
        System.out.println("result1 :" + result1);
        System.out.println("result2 :" + result2);
        List<Student> students = Arrays.asList(new Student("小明", 11), new Student("小红", 12));
        Integer result = students.stream().map(one -> one.getStuAge()).reduce(0, (partSum, value) -> partSum + value);
        Integer otherResult = students.stream().reduce(0, (partSum, student) -> partSum + student.getStuAge(), Integer::sum);
        System.out.println(result);
        System.out.println(otherResult);
    }
}

class Student{
    String stuName;
    int stuAge;

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
