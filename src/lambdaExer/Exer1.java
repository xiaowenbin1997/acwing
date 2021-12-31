package lambdaExer;

import com.mysql.jdbc.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**调用Collections.sort()，比较两个employee，先按年龄比，年龄相同按照姓名比
 * lambda传参
 *
 */
public class Exer1 {
    public static void main(String[] args) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge() != o2.getAge()) {
                    return o1.getAge() - o2.getAge();
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };
        Comparator<Employee> employeeComparator1 = (o1,o2) ->
        {return o1.getAge() == o2.getAge() ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge();};
        List<Employee> employees = Arrays.asList(
                new Employee(10,"lisi"),
                new Employee(11,"wangwu"),
                new Employee(11,"zhangsan")
        );
        Collections.sort(employees, employeeComparator);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println("----------------");
        Collections.sort(employees, employeeComparator1);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
