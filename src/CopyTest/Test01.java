package CopyTest;

public class Test01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("China","HuNan","ShaoYang");
        Customer customer01 = new Customer(24,1,address);
        Customer customer02 = customer01.clone();
        System.out.println("customer01" + customer01);
        System.out.println("customer02" + customer02);
        customer02.setAge(28);
        System.out.println("customer01" + customer01);
        System.out.println("customer02" + customer02);
        customer02.getAddress().setCountry("America");
        System.out.println("customer01" + customer01);
        System.out.println("customer02" + customer02);
    }
}
