package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kalai {

    public static void main(String args[]){

//        String str = "madam";
//
//        boolean out = test(str);
//
//        System.out.println(out);

//        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
//
//
//        List<Integer> even = number.stream().sorted().filter(e -> e % 2 != 0).collect(Collectors.toList());
//
//        System.out.println(even);

//        =================================================================
//        print grater than 3 string

        List<String>  words = Arrays.asList("apple","cat","banana","dog","elelpant");

        List<String> three = words.stream()
                .filter(e-> e.length() > 3).collect(Collectors.toList());

        System.out.println(three);





    }

//    public static boolean test(String str){
//
//        int n = str.length();
//
//        for(int i = 0; i < n/2; i++){
//            if(str.charAt(i) == str.charAt(n-1)){
//                return true;
//            }
//        }
//        return false;
//    }
}
