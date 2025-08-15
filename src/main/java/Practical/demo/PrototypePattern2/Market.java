package Practical.demo.PrototypePattern2;

public class Market {

    private String ShopName;
    private int chocolate;
    private int iceCream;

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public int getChocolate() {
        return chocolate;
    }

    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    public int getIceCream() {
        return iceCream;
    }

    public void setIceCream(int iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String toString() {
        return "Market{" +
                "ShopName='" + ShopName + '\'' +
                ", chocolate=" + chocolate +
                ", iceCream=" + iceCream +
                '}';
    }

}
