package test.SalaryCount;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class IdSalary{
    String id;
    Double salary;
//
//    List<Double> salaryNum
    public IdSalary(String id, Double salary) {
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

public class SalaryCount {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\Users\\xwb\\Desktop\\test55.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        //colloct all relationship
        List<IdSalary> collect = new ArrayList<>();
        while (true) {
            String temp = br.readLine();
            if (temp == null) break;
            String[] split = temp.split(",");
            String tempId = split[0];
            //如果已经入库，就相加，如果没有入库，就新建
            int index = findIdSalary(tempId, collect);
            if (index < 0) {
                IdSalary tempIdSalary = new IdSalary(split[0],Double.parseDouble(split[1]));
                collect.add(tempIdSalary);
            } else {
                IdSalary idSalary = collect.get(index);
                idSalary.setSalary(idSalary.getSalary() + Double.parseDouble(split[1]));
            }
        }
        IdSalary[] idSalaries = collect.toArray(new IdSalary[0]);
        Arrays.sort(idSalaries, new Comparator<IdSalary>() {
            @Override
            public int compare(IdSalary o1, IdSalary o2) {
                if (o1.getSalary() == o2.getSalary()) {
                    return o1.getId().compareTo(o2.getId());
                } else {
                    return (int) (o2.getSalary() - o1.getSalary());
                }
            }
        });
        for (int i = 0;i < idSalaries.length;i++) {
            System.out.println("id:" + idSalaries[i].getId() + ",salary:" + idSalaries[i].getSalary());
        }
    }

    /**
     * 找到就返回i，没找到就返回-1
     * @param tempId
     * @param allRelation
     * @return
     */
    public static int findIdSalary(String tempId,List<IdSalary> allRelation) {
        List<String> collectIds = allRelation.stream().map(m -> m.getId()).collect(Collectors.toList());
        for (int i = 0;i < collectIds.size();i++) {
            if (tempId.equals(collectIds.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
