package program3;

public class MembershipCard extends Card {
	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MembershipCard(String holderName, String cardNumber,
			String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}
	@Override
	public String toString(){
		return "HolderName : "+holderName+" CardNumber : "+cardNumber+" ExpiryDate : "+expiryDate+" Rating : "+rating;
	}
	

}
