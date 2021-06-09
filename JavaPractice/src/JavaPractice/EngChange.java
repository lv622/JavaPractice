package JavaPractice;

import java.util.Scanner;

public class EngChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
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
	}

}
