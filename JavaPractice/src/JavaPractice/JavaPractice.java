package JavaPractice;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String choose = " ";

		while (choose != "") {
			System.out.print("연습 문제 번호 선택(1 ~ 10-1): ");
			choose = scan.nextLine();

			switch (choose) {
			case "1":
				double Celsius = 31.5;
				Temperature(Celsius);
				break;
			case "2":
				TotalAmount();
				break;
			case "3":
				Gugudan();
				break;
			case "4":
				PrintStar(5);
				break;
			case "5":
				GradeCalculation(76);
				GradeCalculation(80);
				GradeCalculation(93);
				GradeCalculation(65);
				GradeCalculation(49);
				break;
			case "6":
				ScoreSumAvg();
				break;
			case "7":
				ArraySumAvg();
				break;
			case "8":
				String str = "Hello, World";
				EngChange(str);
				break;
			case "9":
				String sentence = "Hello World";
				CaesarCipher(sentence);
				break;
			case "9-1":
				SumMethod();
				break;
			case "10-1":
				System.out.println(add(1, 3));
				System.out.println(subtract(1, 3));
				System.out.println(multiply(1, 3));
				System.out.println(divide(1, 3));
				break;
			default:
				System.out.println("종료합니다.");
				choose = "";
				scan.close();
				break;
			}
		}
	}

	// Practice #1
	private static void Temperature(double Celsius) {
		double Fahrenheit = 0;
		System.out.println(String.format("섭씨: %f", Celsius));
		Fahrenheit = Celsius * 9 / 5.0f + 32;
		System.out.println(String.format("화씨: %f", Fahrenheit));
	}

	// Practice #2
	private static void TotalAmount() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
	}

	// Practice #3
	private static void Gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println(String.format("** %d단 **", i));
			for (int j = 1; j < 10; j++) {
				System.out.println(String.format("%d * %d = %d", i, j, i * j));
			}
		}
	}

	// Practice #4
	private static void PrintStar(int line) {
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Practice #5
	private static void GradeCalculation(int score) {
		System.out.println(String.format("점수 입력: %d", score));
		if (score <= 90) {
			System.out.println("학점: A");
		} else if (score <= 80) {
			System.out.println("학점: B");
		} else if (score <= 70) {
			System.out.println("학점: C");
		} else if (score <= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}

	}

	// Practice #6
	private static void ScoreSumAvg() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("점수: ");

		int i = 0, sum = 0;
		float avg = 0;
		int[] students = new int[10];

		for (i = 0; i < 10; i++) {
			students[i] = scan.nextInt();
			sum += students[i];
		}
		avg = sum / i;

		System.out.println(String.format("합계: %d", sum));
		System.out.println(String.format("평균: %f", avg));
	}

	// Practice #7
	private static void ArraySumAvg() {
		int[][] score = { { 90, 90, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };

		for (int i = 0; i < score.length; i++) {
			int sum = 0;

			for (int j = 0; j < score[j].length; j++) {
				sum += score[i][j];
			}

			System.out.println(String.format("ID=%d: 합계=%d, 평균=%d", i, sum, sum / score[i].length));
		}
	}

	// Practice #8
	private static void EngChange(String str) {
		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90) {
				arr[i] += 32;
			} else if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] -= 32;
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	// Practice #9
	private static void CaesarCipher(String sentence) {
		char[] arr = new char[sentence.length()];

		for (int i = 0; i < sentence.length(); i++) {
			arr[i] = sentence.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 65 && arr[i] <= 90) {
				arr[i] += 3;

				if (arr[i] > 90) {
					arr[i] -= 25;
				}
			} else if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] += 3;

				if (arr[i] > 122) {
					arr[i] -= 25;
				}
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	// Practice #9-1
	private static void SumMethod() {
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
			System.out.print(String.format("Sum<%c> = %d", list[i], sum[i]));
			System.out.println();
		}
	}

	// Practice #10
	private static int add(int x, int y) {
		return x + y;
	}

	private static int subtract(int x, int y) {
		return x - y;
	}

	private static int multiply(int x, int y) {
		return x * y;
	}

	private static double divide(double x, double y) {
		return x / y;
	}
}
