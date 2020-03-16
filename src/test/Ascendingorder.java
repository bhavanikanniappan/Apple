package test;

public class Ascendingorder {

	public static void main(String[] args) {

		int num[] = { 25, 56, 61, 12, 10 };
		int length = num.length;
		int temp, i, j;
		System.out.println("The enter number is : ");
		for (i = 0; i < length; i++) {
			System.out.println(num[i] + "  ");
		}
		System.out.println("numbers sorting in ascending order : ");
		for (i = 0; i < length; i++) {

			for (j = i;j < length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
						}
				
				}
		}
		for(i=0;i<length;i++){
			System.out.println(num[i]);
		
		}
		}
	}