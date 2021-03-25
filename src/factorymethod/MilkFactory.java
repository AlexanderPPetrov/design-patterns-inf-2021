package factorymethod;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {

		if(name == "COW_MILK") {
			return new CowMilk();
		}
		
		if(name == "GOAT_MILK") {
			return new GoatMilk();
		}
		
		System.out.println("Unknown milk product: " + name);
		
		return null;
	}

}
