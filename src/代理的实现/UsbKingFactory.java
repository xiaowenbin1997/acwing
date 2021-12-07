package 代理的实现;

//这个类是一个具体的目标类
public class UsbKingFactory implements UsbSell{
    @Override
    public float sell(int amount) {
        return 90.0f;
    }
}
