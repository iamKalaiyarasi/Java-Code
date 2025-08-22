package Practical.demo.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayList {
    public static void main(String args[]){
//        int[] ary = {2,2,3,4,5};
//        String[] ary = {"kalai"};
        String ary = "Kalaiyarasi";
        reverse(ary);
    }

    public static void reverse(String ary){

//        List<Integer> find = IntStream.rangeClosed(1, ary.length)
//                .map(i -> ary[ary.length - i]).boxed().collect(Collectors.toList());
//        System.out.println(find);

//        List<String> list = Arrays.stream(ary).collect(Collectors.toList());
//        Collections.reverse(list);
//        System.out.println(list);

        String reverse = new StringBuilder(ary).reverse().toString();

        System.out.println(reverse);


    }
}
