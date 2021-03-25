package decorator;

public abstract class CarDecorator implements Car {


	protected Car decoratedCar;
	
	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}
	
	@Override
	public void create() {
		// Here we can add functionality 
		this.decoratedCar.create();
		
	}


}
