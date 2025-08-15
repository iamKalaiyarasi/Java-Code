package Practical.demo.PrototypePattern2;

public class main {

    public static void main(String args[]) throws CloneNotSupportedException {

        SuperMarket sm = new SuperMarket();
        sm.setMarketName("kalai Market");
        sm.getloaded();
        System.out.println(sm);

//        SuperMarket sm1 = new SuperMarket();
//        sm1.setMarketName("tamil Market");
//        sm1.getloaded();
//        System.out.println(sm1);

        SuperMarket sm2 = sm.clone();
        sm2.setMarketName("tamil Market");
        sm2.getloaded();
        sm.getMarketList().remove(1);
        System.out.println(sm);
        System.out.println(sm2);


    }
}
