package Practical.demo.SampleCode;

public class FindPalindrome {

    public static void main(String args[]){

        int val = 20023002;
        if(fun(val)){
            System.out.println(val + " is Palindrome");
        } else {
            System.out.println(val + " not a Palindrome");
        }

    }

    public static boolean fun(int num){

        String str = Integer.toString(num);

        int length = str.length();

        for(int i = 0; i<length /2; i++){
            if(str.charAt(i) != str.charAt(length - 1 - i)){
                return false;
            }
        }
        return true;

    }
}
