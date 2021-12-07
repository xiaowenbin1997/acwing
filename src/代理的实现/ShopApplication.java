package 代理的实现;

public class ShopApplication {
    public static void main(String[] args) {
        float price = 0.0f;
        TaoBao taoBao = new TaoBao();
        price = taoBao.sell(1);
        System.out.println("淘宝购买价格为" + price);
        System.out.println("====================");
        WeiShang weiShang = new WeiShang();
        price = weiShang.sell(1);
        System.out.println("微商购买价格为" + price);
        System.out.println("====================");
    }
}
