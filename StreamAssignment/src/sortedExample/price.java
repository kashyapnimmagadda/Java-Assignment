package sortedExample;

public class price {
	String productName;
	int productPrice;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public price() {
		super();
	}

	public price(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

}
