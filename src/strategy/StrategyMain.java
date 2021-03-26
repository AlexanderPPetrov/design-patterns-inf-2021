package strategy;

public class StrategyMain {

	public static void main(String[] args) {


		ShoppingCart shoppingCart = new ShoppingCart();
		Item product1 = new Item("12k3jk12jAAA", 3.40);
		Item product2 = new Item("12k3k1j2A", 1.20);
		
		shoppingCart.addItem(product1);
		shoppingCart.addItem(product2);
		
		PaymentStrategy paypal = new PaypalStrategy("test@abv.bg", "123");
		
		PaymentStrategy credit = new CreditCardStrategy("IVAN IVANO", "1231 1231 2334 2334", "10/22", "531");
		
		
		shoppingCart.pay(paypal);

		shoppingCart.pay(credit);

		
	}

}
