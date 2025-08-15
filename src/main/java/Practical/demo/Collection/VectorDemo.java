package Practical.demo.Collection;

import java.util.Vector;

public class VectorDemo {

    public static void main(String args[]){
        Vector v = new Vector();
//        Vector v1 = new Vector(20);
//        Vector v2 = new Vector(10,5); ---> Size and IncrementCapacity 5 => 15 size
//        Vector v3 = new Vector(collection c);


        v.add(10);
        v.addElement("Kalai");
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
        System.out.println(v.elementAt(0));
        v.add(1);
        v.add(2);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
    }
}
