package Practical.demo.PrototypePattern2;

import Practical.demo.PrototypePattern.Book;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket implements Cloneable{

    private String MarketName;
    List<Market> marketList = new ArrayList<>();

    public String getMarketName() {
        return MarketName;
    }

    public void setMarketName(String marketName) {
        MarketName = marketName;
    }

    public List<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(List<Market> marketList) {
        this.marketList = marketList;
    }

    public void getloaded(){
        for(int i = 1; i<=10; i++){
            Market m = new Market();
            m.setShopName("D-mart");
            m.setChocolate(2 + i);
            m.setIceCream(3 + i);
            getMarketList().add(m);
        }
    }
    @Override
    public String toString() {
        return "SuperMarket{" +
                "MarketName='" + MarketName + '\'' +
                ", marketList=" + marketList +
                '}';
    }

    @Override
    protected SuperMarket clone() throws CloneNotSupportedException {
//        return super.clone();
        SuperMarket m = new SuperMarket();

        for (Market sm : this.marketList){
            m.getMarketList().add(sm);
        }

        return m;
    }
}
