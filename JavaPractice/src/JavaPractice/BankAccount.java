package JavaPractice;

import java.util.Scanner;

class subBankAccount {
	int money;
	int balance;
	int choose;
	int notmoney;
	int menu = 0;

	public void startMenu() {
		System.out.println("1. 입금 2. 출금 3. 잔고 4. 종료");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		switchCase(choose, money);
	}

	void pullMoney(int money) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입금 금액: ");
		money = scan.nextInt();
		balance += money;
	}

	void putMoney(int money) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출금 금액: ");
		money = scan.nextInt();

		if (balance >= money) {
			balance -= money;
		} else {
			System.out.println("잔액 부족");
			notmoney = 1;
		}
	}

	int balanceMoney() {
		System.out.println(String.format("현재 잔액: %d", balance));
		
		return balance;
	}

	void endMenu() {
		menu = 1;
	}

	void switchCase(int choose, int money) {
		switch (choose) {
		case 1:
			pullMoney(money);
			break;
		case 2:
			putMoney(money);
			break;
		case 3:
			balanceMoney();
			if (notmoney == 1) {
				break;
			}
			break;
		case 4:
			endMenu();
			menu = 1;
			System.out.println("종료");
			break;
		}
	}
}

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		subBankAccount start = new subBankAccount();
		start.notmoney = 0;

		while (start.menu == 0) {
			start.startMenu();
		}
	}
}
