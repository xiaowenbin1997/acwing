package 代理的动态实现;

public class UsbKingFactory implements UsbSell{

    @Override
    public float sell(int amount) {
        return 90.0f;
    }
}
