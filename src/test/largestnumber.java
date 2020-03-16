package test;

public class largestnumber {

	public static void main(String[] args) {
		int num[] = { 25, 56, 58, 12, 8 };
		int length = num.length;
		int temp = num[0];
		for (int i = 0; i < length; i++) {
			if (temp < num[i]) {
				temp = num[i];
			}
			}
		System.out.println("The Largest Number is : " + temp);
	}
}

