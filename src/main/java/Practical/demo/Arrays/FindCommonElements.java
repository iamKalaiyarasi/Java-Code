package Practical.demo.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {

    public static void main(String args[]){
        int[] ary1 = {1,2,3,4,5,6,};
        int[] ary2 = {1,2,3,8,9,6};
        findCommon(ary1, ary2);


    }

    public static void findCommon(int[] ary1, int[] ary2){

        List<Integer> find = Arrays.stream(ary1).filter(number -> Arrays.stream(ary2).anyMatch(number2 -> number2 == number))
                .boxed().collect(Collectors.toList());

        System.out.println(find);
    }
}
