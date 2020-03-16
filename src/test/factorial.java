package test;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int number;
		int temp;
		System.out.println("Enter the Factorial number");
		Scanner num = new Scanner(System.in);
		number = num.nextInt();
		temp = number;
		if (number == 0 || number == 1) {
			System.out.println(" The factorial value is : 1 ");
		}

		else {
			do {
				temp = temp * (number - 1);
				number = number - 1;
			} while (number != 1);

		}
		System.out.println(" The Factorial Value is : " + temp);
	}
}
