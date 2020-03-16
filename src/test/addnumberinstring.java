package test;

public class addnumberinstring {

	public static void main(String[] args) {
		String usertxt, substring;
		usertxt = "Java was founded in 1995";
		substring = usertxt.substring(20, 24);
		System.out.println(" the number in the given string is : " + substring);
		int num = Integer.parseInt(substring);
		System.out.println(" The number to be added is : " + num);
		int temp = num;
		int temp1 = 0;
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			if (num % 10 != 0) {
				temp1 = num % 10;
				count = count + temp1;

			}
			num = temp / 10;
			temp = num;
		}
		System.out.println("The sum of number is : " + count);
	}
}