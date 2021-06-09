package JavaPractice;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Double Fahrenheit;

		System.out.printf("섭씨: ");
		Double Celsius = input.nextDouble();

		Fahrenheit = 32.0 + Celsius * 1.8;

		System.out.println("화씨 : " + Fahrenheit);
	}

}
