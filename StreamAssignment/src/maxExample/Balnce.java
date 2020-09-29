package maxExample;

public class Balnce {
	private String custName;
	private int balance;

	public Balnce() {
		super();
	}

	public Balnce(String custName, int balance) {
		super();

		this.custName = custName;
		this.balance = balance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
