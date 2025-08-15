package Practical.demo.FactoryPattern;

import Practical.demo.FactoryPatterOsClass.*;

public class Factorymain {
    public static void main(String args[]){

       ObjectCreationFactory factory = new ObjectCreationFactory();
       Os os = factory.getInstance("kalai");
       os.test();
    }
}
