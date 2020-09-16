package program3;

public class PaybackCard extends Card {
	private int pointsEarned;
	private double totalAmount;

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public PaybackCard(String holderName, String cardNumber, String expiryDate,
			int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "PaybackCard [pointsEarned=" + pointsEarned + ", totalAmount="
				+ totalAmount + ", holderName=" + holderName + ", cardNumber="
				+ cardNumber + ", expiryDate=" + expiryDate + "]";
	}
}
