package Practical.demo.InterfaceJava8;

public interface a {

    void show();
    default void test(){
        System.out.println("interface A");
    }
}
