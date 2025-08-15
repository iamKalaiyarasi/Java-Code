package Practical.demo.Collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String args[]){

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(true);
        System.out.println(s);
        s.pop();
        System.out.println(s);

//        peek will print the top of the element int the stack
        Object obj = s.peek();
        System.out.println(obj);

//        empty() -> if stack having element it will return false or else will return true
        System.out.println(s.empty());

//        search()  -> to search the position of the element from the count of top to bottom
        System.out.println(s.search(30));

    }
}
