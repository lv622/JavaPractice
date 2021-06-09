package JavaPractice;

import java.util.Scanner;

public class ScoreSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.printf("점수: ");

		int i = 0, sum = 0, avg = 0;
		int[] students = new int[10];

		for (i = 0; i < 10; i++) {
			students[i] = input.nextInt();

			sum += students[i];
		}
		avg = sum / i;

		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
