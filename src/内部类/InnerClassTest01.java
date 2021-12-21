package 内部类;

class People {
    String name;
    private int age;

    public People(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        SpeakAge speakAge = new SpeakAge();
        speakAge.sayAge();//必须先创建成员内部类的对象，才能进行访问
    }

    class SpeakName {
        public void sayName(){
            System.out.println("name =" + name);//成员内部类可以访问外部类的成员
        }
    }
    class SpeakAge {
        public void sayAge(){
            System.out.println("age =" + age);
        }
    }
}

public class InnerClassTest01 {
    public static void main(String[] args) {
        People people = new People("jiuzhe");
        people.setAge(11);
    }
}