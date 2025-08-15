package Practical.demo.SampleCode;

public class Factorial {

    public static void main(String args[]){

        int fact = 10;

        int result  = fun(fact);

        System.out.println("Factorial of " + fact + " " + "is " + result);
    }

    public static int fun(int fac){

        int fact = 1;
        for(int i = 1; i<=fac; i++){

            fact = fact * i;

        }
        return fact;
    }
}
