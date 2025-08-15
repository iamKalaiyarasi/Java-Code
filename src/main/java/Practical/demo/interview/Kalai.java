package Practical.demo.interview;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kalai {

    public static void main(String args[]){

       List<String> str = Arrays.asList("one", "two", "three", "four", "five", "six", "one", "five");



        List<String> duplicate = str.stream().distinct().collect(Collectors.toList());

        System.out.println(duplicate);





    }



}
