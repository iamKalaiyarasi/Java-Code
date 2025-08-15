package Practical.demo.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String args[]){
//        Consumer<String> message = m -> System.out.println(m);
//        message.accept("Hi");

        List<String> message = new ArrayList<>();
        message.add("Hello");
        message.add("Hi");
        message.add("welcome");

//        Lambda expression
//        Consumer<String> printMessage = m -> System.out.println(m);
//       Method reference
        Consumer<String> printMessage = System.out::println;
        message.forEach(printMessage);
    }
}
