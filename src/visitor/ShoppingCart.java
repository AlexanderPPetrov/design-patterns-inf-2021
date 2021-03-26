package visitor;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public double visit(Book book) {

		double price = book.getPrice();
		if(price > 50) {
			price = price - 5;
		}
		
		System.out.println("Book:" + book.getTitle() + " will cost: " + price);
	
		return price;
	}

	@Override
	public double visit(Fruit fruit) {

		double price = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit:" + fruit.getName() + " will cost: " + price);

		return price;
	}

}
