package composite;

public class CompositeMain {

	public static void main(String[] args) {


		Manager manager1 = new Manager("Georgi", 6000);
		Developer dev1 = new Developer("Ivan", 3000);
		Developer dev2 = new Developer("Peter", 4000);
		
		manager1.add(dev1);
		manager1.add(dev2);
		
		Manager manager2 = new Manager("Petkan", 8000);
		Developer dev3 = new Developer("Vasil", 7000);
		
		manager2.add(manager1);
		manager2.add(dev3);
		
		
		manager2.printData();
	}

}
