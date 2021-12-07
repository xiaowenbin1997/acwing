package 代理的实现;

public class WeiShang implements UsbSell{
    private UsbKingFactory factory = new UsbKingFactory();
    //也是中间商，在中间完成任务,或者帮把手
    @Override
    public float sell(int amount) {
        float price = factory.sell(amount);
        return price + 10;
    }
}
