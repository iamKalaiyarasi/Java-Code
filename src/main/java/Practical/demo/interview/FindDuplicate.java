package Practical.demo.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String args[]){

        List<String> str = Arrays.asList("one", "two", "three", "one", "two");

        Set<String> set = new HashSet<>();

        Set<String> find = str.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());

        System.out.println(find);


    }
}
