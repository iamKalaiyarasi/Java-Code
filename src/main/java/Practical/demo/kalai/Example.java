package Practical.demo.kalai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(1,2,3,6,5,8,2,3,3);

        List<Integer> ll = list.stream().distinct().collect(Collectors.toList());

        System.out.println(ll);
    }
}
