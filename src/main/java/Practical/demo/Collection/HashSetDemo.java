package Practical.demo.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]){

        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(20);
        HashSet hs2 = new HashSet(100, .8f);

//         adding collections into the constructor
        ArrayList as = new ArrayList();
        HashSet hs3 = new HashSet(as);

    }
}
