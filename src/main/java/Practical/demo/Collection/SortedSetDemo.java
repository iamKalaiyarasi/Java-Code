package Practical.demo.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String args[]){
        SortedSet ss = new TreeSet();
        ss.add(2);
        ss.add(6);
        ss.add(3);
        ss.add(1);
        ss.add(5);
        ss.add(4);
        System.out.println(ss);

        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(4));
        System.out.println(ss.tailSet(3));
        System.out.println(ss.subSet(2,5));
        System.out.println(ss.comparator());
    }


}
