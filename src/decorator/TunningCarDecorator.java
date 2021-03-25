package decorator;

public class TunningCarDecorator extends CarDecorator {

	public TunningCarDecorator(Car decoratedCar) {
		super(decoratedCar);
	}
	
	@Override
	public void create() {
		decoratedCar.create();
		this.setTunning();
	}

	private void setTunning() {
		System.out.println("Tunning car with some extras");
	}
	

}
