package abstractTest;

public abstract class FatherClass implements father{
    @Override
    public void print() {
        System.out.println("父抽象类");
    }
    public abstract void sou();
}
