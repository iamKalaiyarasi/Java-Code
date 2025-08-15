package Practical.demo.interview;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String args[]){
        List<String> names = Arrays.asList("first","second","third","fourth","fifth","first");

//        Filter
        List<String> filter = names.stream()
                .filter(n -> n.startsWith("f"))
                .collect(Collectors.toList());

        System.out.println("filter: " + filter);
//        map()

        List<String> map = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("map: "+map);

//        sorted()

        List<String> sort = names.stream().sorted().collect(Collectors.toList());

        System.out.println("sort: " + sort);

//        distinct() - remove duplicates

        List<String> distinct = names.stream().distinct().collect(Collectors.toList());

        System.out.println("distinct:" + distinct);

//        reduce() - reduce elements to a single value

        String reduce = names.stream().reduce("",(n1, n2) -> n1 + " "+n2);

        System.out.println("reduce:" + reduce);

//        forEach() - Iterate through elements
//     using method reference
        names.forEach(System.out::println);

//        using lambda function
        names.forEach(i -> System.out.println("forEach:" + i));

//        Sorting string
        List<String> str = Arrays.asList("kalai", "tamil", "ezhil", "eshu");
        List<String> string = str.stream().sorted().collect(Collectors.toList());
        System.out.println(string);

//        odd number
        List<Integer> num = Arrays.asList(6,5,4,9,8,7);
        List<Integer> odd = num.stream().filter(a -> a%2==1).collect(Collectors.toList());
        System.out.println("odd num:" + odd);

//        Even number
        List<Integer> nums = Arrays.asList(2,3,6,9,8,7,5);
        List<Integer> even = nums.stream().sorted().filter(a -> a%2!=1).collect(Collectors.toList());
        System.out.println("Even Number:" + even);

//        count
        List<Integer> nu = Arrays.asList(5,6,9,7,5,4,5);
        long count = nu.stream().count();
        System.out.println("Count:" + count);

//        reverse
        String buff = "kalai";
        String  bu = new StringBuilder(buff).reverse().toString();
        System.out.println(bu);

        String val = "kalai tamil eshu";
        String values = new StringBuilder(val).reverse().toString();
        System.out.println(values);

//        replace
        String rep = "kalai tamil";
        String replace = new StringBuilder(rep).replace(6,11, "Eshu").toString();
        System.out.println(replace);

//        reverse normal java code

        String strs = "kalai";
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length()-1;i>=0;i--){
            sb.append(strs.charAt(i));
        }
        System.out.println("bulder:" + sb.toString());



    }
}
