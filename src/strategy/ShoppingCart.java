package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		
		for(Item item: this.items) {
			totalPrice = totalPrice + item.getPrice();
		}
		
		return totalPrice;
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		double totalPrice = getTotalPrice();
		paymentStrategy.pay(totalPrice);
	}
	
}
