package Practical.demo.SampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String args[]){
        String input = "kalaiyarasi";
        test(input);

//        List<Integer> list = Arrays.asList(2,3,3,2,5,4 ,3,7,8);
//
////        ArrayList<Integer> al = new ArrayList<>()(20);
//        List<Integer> val = list.stream().distinct().collect(Collectors.toList());
//
//        System.out.println(val);

    }

    public static void test(String input){

        StringBuilder sb = new StringBuilder();
        for (int i=input.length()-1; i>=0; i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
