package abstractfactory;

public abstract class AbstractFactory {
	abstract Shape getShape(String name);
	abstract Color getColor(String name);
}
