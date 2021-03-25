package factorymethod;

public class CheeseFactory extends FarmFactory {

	
	@Override
	public FarmProduct createProduct(String name) {

		if(name == "COW_CHEESE") {
			return new CowCheese();
		}
		
		if(name == "GOAT_CHEESE") {
			return new GoatCheese();
		}
		
		System.out.println("Unknown cheese product: " + name);
		
		return null;
	}

}
