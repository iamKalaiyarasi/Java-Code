package Practical.demo.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 2);

        List<Integer> expectedNums = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(expectedNums);


    }
}
