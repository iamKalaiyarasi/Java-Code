package Practical.demo.interview;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String args[]){
        List<Integer> values = Arrays.asList(1,2,3,4,5);
//External Loop - before java 8
//                for (int i=0;i<values.size();i++){
//                    System.out.println(values.get(i));
//                }

//        for(int i:values){
//            System.out.println(i);
//        }



//        Internal loop - in java 8
//        Much faster than the Exterbal loop

        values.forEach(i -> System.out.println(i));
    }


}
