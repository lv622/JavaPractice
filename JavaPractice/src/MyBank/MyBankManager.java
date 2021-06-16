package MyBank;

import java.util.*;

public class MyBankManager {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Data> m = new ArrayList<>();
	private int num;
	private int menu;
	private int money;
	boolean end;
	private static int account;

	// 계좌번호 중복 거르는 것 추가해야 함
	private static int creatAccount() {

		account = (int) ((Math.random() * 10000 + 10000) % 1000000);

		return account;
	}

	void enterData() {
		System.out.print("성함 : ");
		String name = sc.next();
		int account = creatAccount();
		int balance = 0;
		System.out.println("계좌가 생성되었습니다.");

		m.add(new Data(name, account, balance));

		for (int i = 0; i < m.size(); i++) {
			if (name == m.get(i).getName()) {
				System.out.println("-------------------------------------------");
				System.out.println(" 성함\t\t 계좌번호\t\t 잔액");
				System.out.println("-------------------------------------------");
				if (m.get(i) instanceof Data) {
					System.out.println(String.format(" %s \t\t 123-%d \t %d", m.get(i).getName(), m.get(i).getAccount(),
							m.get(i).getBalance()));
				} else if (m.size() == 0) {
					System.out.println("자료가 존재하지 않습니다.");
				}
				System.out.println("-------------------------------------------");
			}
		}
	}

	void printList() {
		System.out.println("-------------------------------------------");
		System.out.println(" 성함\t\t 계좌번호\t\t 잔액");
		System.out.println("-------------------------------------------");

		for (int i = 0; i < m.size(); i++) {
			if (m.get(i) instanceof Data) {
				System.out.println(String.format(" %s \t\t 123-%d \t %d", m.get(i).getName(), m.get(i).getAccount(),
						m.get(i).getBalance()));
			} else if (m.size() == 0) {
				System.out.println("자료가 존재하지 않습니다.");
			}
		}
		System.out.println("-------------------------------------------");
	}

	void findMyAccount() {
		System.out.print("계좌번호를 입력하세요. (123-#####) : ");
		int findAccount = scanInt();

		for (int i = 0; i < m.size(); i++) {
			if (findAccount == m.get(i).getAccount()) {
				System.out.println("-------------------------------------------");
				System.out.println(" 성함\t\t 계좌번호\t\t 잔액");
				System.out.println("-------------------------------------------");
				if (m.get(i) instanceof Data) {
					System.out.println(String.format(" %s \t\t 123-%d \t %d", m.get(i).getName(), m.get(i).getAccount(),
							m.get(i).getBalance()));
				} else if (findAccount != m.get(i).getAccount()) {
					System.out.println("자료가 존재하지 않습니다.");
				}
				System.out.println("-------------------------------------------");
			}
		}

		/*
		 * 이름으로 검색했을 때 출력이 안됨. System.out.print("조회 할 데이터를 선택하세요. (1)성함 (2)계좌번호 : ");
		 * int choose = scanInt();
		 * 
		 * if (choose == 1) { System.out.print("성함을 입력하세요: "); String findName =
		 * sc.next();
		 * 
		 * // for문이나 if문이 안돌아가는 듯 for (int i = 0; i < m.size(); i++) { if (findName ==
		 * m.get(i).getName()) {
		 * System.out.println("-------------------------------------------");
		 * System.out.println(" 성함\t\t 계좌번호\t\t 잔액");
		 * System.out.println("-------------------------------------------"); if
		 * (m.get(i) instanceof Data) {
		 * System.out.println(String.format(" %s \t\t 123-%d \t %d", m.get(i).getName(),
		 * m.get(i).getAccount(), m.get(i).getBalance())); } else if (m.size() == 0) {
		 * System.out.println("자료가 존재하지 않습니다."); }
		 * System.out.println("-------------------------------------------"); } } } else
		 * if (choose == 2) { System.out.print("계좌번호를 입력하세요. (123-#####) : "); int
		 * findAccount = scanInt();
		 * 
		 * for (int i = 0; i < m.size(); i++) { if (findAccount ==
		 * m.get(i).getAccount()) {
		 * System.out.println("-------------------------------------------");
		 * System.out.println(" 성함\t\t 계좌번호\t\t 잔액");
		 * System.out.println("-------------------------------------------"); if
		 * (m.get(i) instanceof Data) {
		 * System.out.println(String.format(" %s \t\t 123-%d \t %d", m.get(i).getName(),
		 * m.get(i).getAccount(), m.get(i).getBalance())); } else if (m.size() == 0) {
		 * System.out.println("자료가 존재하지 않습니다."); }
		 * System.out.println("-------------------------------------------"); } } }
		 */
	}

	void pullMoney() {
		System.out.print("계좌번호를 입력하세요. (123-#####) : ");
		int myAccount = scanInt();

		for (int i = 0; i < m.size(); i++) {
			if (myAccount == m.get(i).getAccount()) {
				System.out.print("현재 계좌는 123-" + m.get(i).getAccount() + "입니다. 입금하실 금액은?: ");
				money = scanInt();
				m.get(i).setBalance(m.get(i).getBalance() + money);
			}
		}
	}

	void putMoney() {
		System.out.print("계좌번호를 입력하세요. (123-#####) : ");
		int myAccount = scanInt();

		for (int i = 0; i < m.size(); i++) {
			if (myAccount == m.get(i).getAccount()) {
				System.out.print("현재 계좌는 123-" + m.get(i).getAccount() + "입니다. 출금하실 금액은?: ");
				money = scanInt();

				if (m.get(i).getBalance() >= money) {
					m.get(i).setBalance(m.get(i).getBalance() - money);
					System.out.println("출금이 완료되었습니다.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			}
		}
	}

	void menu() {
		if (menu == 1)
			enterData();
		if (menu == 2)
			printList();
		if (menu == 3)
			findMyAccount();
		if (menu == 4)
			pullMoney();
		if (menu == 5)
			putMoney();

	}

	void run() {
		while (true) {
			System.out.println();
			System.out.println("1. 계좌 생성\t2. 전체 계좌 출력\t3. 내 계좌 확인");
			System.out.println("4. 입금 하기\t5. 출금 하기\t6. 종료 하기");
			System.out.print("선택: ");
			menu = scanInt();
			if (menu == 6)
				break;
			menu();
		}
		System.out.print("종료합니다.");
	}

	int scanInt() {
		while (true) {
			try {
				num = new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyBankManager().run();
	}
}
