import java.util.Objects;

public class SportsApparels {

	private String product;
	//shirts,shorts,boots,gloves,pads,
	private int price;
	private int quantity;
	private int entryDate;
	private int totalPrice ;
	
	//constructor
	public SportsApparels(String product, int price, int quantity, int entryDate, int totalPrice) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.entryDate = entryDate;
		this.totalPrice = totalPrice;
	}
	//getters ... setters

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(int entryDate) {
		this.entryDate = entryDate;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "SportsApparels [product=" + product + ", price=" + price + ", quantity=" + quantity + ", entryDate="
				+ entryDate + ", totalPrice=" + totalPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(entryDate, price, product, quantity, totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportsApparels other = (SportsApparels) obj;
		return entryDate == other.entryDate && price == other.price && Objects.equals(product, other.product)
				&& quantity == other.quantity && totalPrice == other.totalPrice;
	}
	
	
}
