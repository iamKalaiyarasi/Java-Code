package Practical.demo.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String ShopName;
    List<Book> bookList = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadBook(){

        for(int i = 1; i<=10; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book "+i);
            getBookList().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
//        return super.clone();

        BookShop shop = new BookShop();
        for (Book bs : this.getBookList()){
            shop.getBookList().add(bs);
        }
        return shop;
    }
}
