package abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String name) {
		
		if(name == "COLOR_FACTORY") {
			return new ColorFactory();
		}
		
		if(name == "SHAPE_FACTORY") {
			return new ShapeFactory();
		}
		
		System.out.println("Unknown factory: " + name);
		return null;
	}
	
}
