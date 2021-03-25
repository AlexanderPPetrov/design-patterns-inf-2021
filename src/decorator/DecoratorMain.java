package decorator;

public class DecoratorMain {

	public static void main(String[] args) {

		 Car lada = new Lada();
		 lada.create();
		 
		 Car anotherLada = new Lada();
		 Car blueLada = new BlueCarDecorator(anotherLada);
		 blueLada.create();
		 
		 Car yetMoreAnotherLada = new Lada();
		 Car tunnedLada = new TunningCarDecorator(yetMoreAnotherLada);
		 tunnedLada.create();

	}

}
