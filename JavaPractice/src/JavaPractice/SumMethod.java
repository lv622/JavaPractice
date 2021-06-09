package JavaPractice;

import java.util.Scanner;

public class SumMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		char[] list = { 'A', 'B' };
		int[] score = new int[5];
		int[] sum = new int[list.length];

		for (int i = 0; i < list.length; i++) {
			System.out.printf(list[i] + ": ");
			for (int j = 0; j < score.length; j++) {
				score[j] = scan.nextInt();
				sum[i] += score[j];
			}
			System.out.print("Sum<" + list[i] + "> = " + sum[i]);
			System.out.println();
		}
	}
}
