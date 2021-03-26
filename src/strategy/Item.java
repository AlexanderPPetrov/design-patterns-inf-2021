package strategy;

public class Item {
	
	private String barCode;
	private double price;
	
	public Item(String barCode, double price) {
		super();
		this.barCode = barCode;
		this.price = price;
	}

	public String getBarCode() {
		return barCode;
	}

	public double getPrice() {
		return price;
	}
	
}
