package visitor;

public class VisitorMain {

	public static void main(String[] args) {

		Product book = new Book("The witcher", 60);
		Product banana = new Fruit("Banana", 2.5, 2);
		Product grape = new Fruit("Grape", 3, 1);
		
		
		ShoppingCart shoppingCart = new ShoppingCart(); 
		
		double priceForBook = book.accept(shoppingCart);
		double pricerForBananas = banana.accept(shoppingCart);
		double priceForGrape = grape.accept(shoppingCart);
		
		
	}

}
