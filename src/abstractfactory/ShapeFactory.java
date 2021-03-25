package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String name) {

		if(name == "CIRCLE") {
			return new Circle();
		}
		
		if(name == "RECTANGLE") {
			return new Rectangle();
		}
		
		System.out.println("Unknown shape: " + name);
		
		return null;
	}

	@Override
	Color getColor(String name) {
		// It's not a color factory :(
		return null;
	}

}
