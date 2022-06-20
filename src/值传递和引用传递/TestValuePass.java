package 值传递和引用传递;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TestValuePass {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("丽丽", 44), new Student("旺旺", 18), new Student("滴滴", 33));
        SortUtils sortUtils = new SortUtils();
        System.out.println(students);
        System.out.println("main中地址：" + System.identityHashCode(students));
        sortUtils.sortStuList(students);
        System.out.println(students);
    }
}

class SortUtils {
    public void sortStuList(List<Student> studentList) {
        System.out.println("func中地址：" + System.identityHashCode(studentList));
        Student[] students = studentList.toArray(new Student[0]);
        Arrays.sort(students, new MyComparator());
        studentList = Arrays.asList(students);
        System.out.println("func中地址：" + System.identityHashCode(studentList));
//        System.out.println(studentList);
    }

    public List<Student> sortStuList01(List<Student> studentList) {
        List<Student> stus = studentList.stream().sorted((stu01, stu02) -> {
            return stu01.getAge() - stu02.getAge();
        }).collect(Collectors.toList());
        return stus;
    }
}

class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
