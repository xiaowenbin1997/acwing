package CopyTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class Customer implements Cloneable{
    public int age;
    public int id;
    public Address address;

    public Customer(int age, int id, Address address) {
        this.age = age;
        this.id = id;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        Customer customer02 = (Customer)super.clone();
        customer02.address = address.clone();
        return customer02;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age='" + age + '\'' +
                ", id='" + id + '\'' +
                "," +
                address.toString() + '\'' +
                '}';
    }
//暂时有问题，不会这个写入写出
    public static Object cloneObject(Object obj) throws Exception{
        ByteArrayOutputStream byteout = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteout);
        outputStream.writeObject(obj);
        ByteArrayInputStream bytein = new ByteArrayInputStream(byteout.toByteArray());
        return obj;
    }
}
