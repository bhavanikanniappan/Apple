package test;

public class Swaptwonumbers {

	public static void main(String[] args) {
		int num1 = 38;
		int num2 = 263;

		System.out.println("The given numbers are");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		num1 =num1-num2;
		num2 =num1+num2;
		num1=num2-num1;

		System.out.println("The swapped numbers are");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

}
