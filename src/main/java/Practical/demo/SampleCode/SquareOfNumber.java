package Practical.demo.SampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfNumber {

    public static void main(String args[]){
        List<Integer> num = Arrays.asList(1,5,7,3,9,2);
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < num.size() ; i++){
            int mul = num.get(i)* num.get(i);
            al.add(mul);

        }
        System.out.println(al);


//        ArrayList<Integer> al = new ArrayList<>();
//        int[]num = {1,5,7,3,9,2,2,};
//
//        for (int i = 0; i < num.length ; i++){
//            al.add(num[i]*num[i]);
//
//        }
//        System.out.println(al);
    }
}
