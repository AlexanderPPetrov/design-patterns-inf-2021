package decorator;

public class BlueCarDecorator extends CarDecorator {


	public BlueCarDecorator(Car decoratedCar) {
		super(decoratedCar);
	}
	
	@Override
	public void create() {
		decoratedCar.create();
		this.setBlueColor();
	}

	private void setBlueColor() {
		System.out.println("Decorating car with blue");
	}
}
