package JavaPractice;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter line number: ");
		int number = input.nextInt();

		for (int i = 0; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
