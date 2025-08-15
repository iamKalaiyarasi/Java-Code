package Practical.demo.Arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayList {
    public static void main(String args[]){
        int[] ary = {1,2,3,4,5};
        reverse(ary);
    }

    public static void reverse(int[] ary){

        List<Integer> find = IntStream.rangeClosed(1, ary.length)
                .map(i -> ary[ary.length - i]).boxed().collect(Collectors.toList());
        System.out.println(find);
    }
}
