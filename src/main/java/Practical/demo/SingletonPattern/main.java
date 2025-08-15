package Practical.demo.SingletonPattern;

public class main {

    public static void main(String args[]) {
        Singleton obj = Singleton.getInstance();

//        this will create Only one instance, if we create 2 the same memory address.
//        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj);
//        System.out.println(obj1);
    }

}
