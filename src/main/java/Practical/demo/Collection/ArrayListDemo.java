package Practical.demo.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String args[]){

//        ArrayList al = new ArrayList();
//        al.add(10);
//        al.add("kalai");
//        System.out.println(al);

        ArrayList al1 = new ArrayList(30);
        al1.add(20);
        al1.add("tamil");
        System.out.println(al1);

//        ArrayList al2 = new ArrayList(Collection c);  -->  one type of constructor in array list

        ArrayList<String> as = new ArrayList<>(20);
        as.add("kalai");
        as.add("tamil");
        System.out.println(as);


        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(20);
        ai.add(30);
        ai.add(40);
        System.out.println(ai);
        ai.remove(2);
        System.out.println(ai);
        System.out.println(ai.get(1));

    }
}
