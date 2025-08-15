package Practical.demo.BuilderPattern;

public class main {
    public static void main(String args[]){
//        Phone ph = new Phone("Android",5,2.2, 32, 35);

        Phone ph = new PhoneBuilder().setPhoneType("Android").setscreanSize(2.2).getPhone();
        System.out.println(ph);
    }
}
