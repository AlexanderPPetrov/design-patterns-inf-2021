package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String name) {
		
		if(name == "RED") {
			return new Red();
		}
		
		if(name == "BLUE") {
			return new Blue();
		}
		
		System.out.println("Unknown color: " + name);
		return null;
	}

}
