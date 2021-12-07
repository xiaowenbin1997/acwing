package 代理的实现;

public class TaoBao implements UsbSell{
    private UsbKingFactory factory = new UsbKingFactory();
    //中间商，代理类,利用工厂类完成一个任务，然后收过路费，中间可以加功能，也可以代替实现
    @Override
    public float sell(int amount) {
        float price = factory.sell(amount);
        return price + 30;
    }
}
