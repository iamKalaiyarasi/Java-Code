package Coding;

public class reverseString {

    public static void main(String args[]){

        String rs = "kalaiyarasi";
        fun(rs);
    }

    public static void fun(String val){

        StringBuilder sb = new StringBuilder();

        for(int i = val.length()-1; i>=0; i--){
            sb.append(val.charAt(i));
        }
        System.out.println(sb.toString());

    }

//    public static void fun(String val){
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(val).reverse().toString();
//
//       System.out.println(sb);
//    }

}
