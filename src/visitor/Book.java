package visitor;

public class Book implements Product {

	private double price;
	private String title;
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

}
