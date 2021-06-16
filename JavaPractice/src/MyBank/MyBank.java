package MyBank;

public class MyBank {
	private String name;
	private int account;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public MyBank(String name, int account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
}
