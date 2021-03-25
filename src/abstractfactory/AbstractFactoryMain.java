package abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {


		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE_FACTORY");
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR_FACTORY");
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	
	}

}
