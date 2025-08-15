package Practical.demo.PrototypePattern;

public class main {
    public static void main(String args[]) throws CloneNotSupportedException {

        BookShop bs = new BookShop();
        bs.setShopName("kalai Books");
        bs.loadBook();
        System.out.println(bs);

//        Object creation like bs

//        BookShop bs2 = new BookShop();
//        bs2.setShopName("tamil");
//        bs2.loadBook();
//        System.out.println(bs2);

//        Object creation from bs by using bs.clone()
        BookShop bs1 = bs.clone();
        bs.getBookList().remove(2);
        bs1.setShopName("tamil");
        bs1.loadBook();
        System.out.println(bs);
        System.out.println(bs1);
    }
}
