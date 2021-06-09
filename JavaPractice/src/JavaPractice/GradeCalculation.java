package JavaPractice;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("점수 입력: ");

		int score = input.nextInt();

		if (score >= 90) {
			System.out.printf("학점: A");
		} else if (score >= 80) {
			System.out.printf("학점: B");
		} else if (score >= 70) {
			System.out.printf("학점: C");
		} else if (score >= 60) {
			System.out.printf("학점: D");
		} else
			System.out.printf("학점: F");
	}

}
