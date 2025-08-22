package Practical.demo.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class A {

    public static void main(String args[]) {
        String str = "KalaiyarasiTamilarasan".toLowerCase();


        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + "=>" + entry.getValue());
            }
        }
    }

}
