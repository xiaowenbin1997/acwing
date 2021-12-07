package 代理的实现;

public interface UsbSell {
    /**
     * 定义目标接口中的目标方法，卖u盘
     * @param amount u盘卖的个数
     * @return u盘卖的金额
     */
    float sell(int amount);
}
