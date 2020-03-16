package test;

public class printatoz {

	public static void main(String[] args) {
		char alph[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		int i;
		int alphlength;

		alphlength = alph.length;

		for (i = 0; i < alphlength; i++)

			System.out.println(alph[i]);

	}

}
