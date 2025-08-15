package Practical.demo.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String args[]){
//        TreeSet ts = new TreeSet();
//        ts.add(20);
//        ts.add(50);
//        ts.add(40);
//        ts.add(30);
//        ts.add(10);
//
//        System.out.println(ts);


        TreeSet ts = new TreeSet(new ComparatorDemo());
        ts.add(2);
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(1);

        System.out.println(ts);
    }



}
