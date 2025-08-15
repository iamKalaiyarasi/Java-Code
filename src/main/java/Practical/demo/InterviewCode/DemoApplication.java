package Practical.demo.InterviewCode;

public class DemoApplication {

	public static void main(String[] args) {

		int x= 100, y=200;
		System.out.println("Before swap");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		int temp = x;
		x=y;
		y=temp;
		System.out.println("after swap");
		System.out.println("x:" + x);
		System.out.println("y:" + y);

//		System.out.println("Hello world");
	}

}
