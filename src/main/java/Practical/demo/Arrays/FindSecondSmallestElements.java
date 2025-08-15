package Practical.demo.Arrays;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Arrays;

public class FindSecondSmallestElements {

    public static void main(String args[]){

//        List<Integer> secondSmallest = Arrays.asList(2, 3, 5, 7, 4, 5);

        int[] ss = {2, 3, 5, 7, 4, 5};

        findSecondSmallest(ss);
    }

    public static void findSecondSmallest(int[] ss){

       int find = Arrays.stream(ss).distinct().sorted().skip(4).findFirst().orElseThrow(() -> new RuntimeException());

        System.out.println(find);

    }
}
