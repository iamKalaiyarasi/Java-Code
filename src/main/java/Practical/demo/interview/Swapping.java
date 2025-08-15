package Practical.demo.interview;

import java.util.Scanner;

public class Swapping {

//    public static void main(String args[]){
////            int x= 100;
////            int y = 200;
//
////            System.out.println("Before swap");
////            System.out.println("x:"+ x);
////        System.out.println("yx:"+ y);
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        int temp = 0;
//        temp = x;
//        x = y;
//        y = temp;
//
//
//
//
//        System.out.println("after swap");
//        System.out.println("x:"+ x);
//        System.out.println("yx:"+ y);
//
//
//    }

    public static void main(String args[]){

        int x = 10;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("x:"+ x);
        System.out.println("y:"+ y);
    }


}
