package factory;


public class main {

	public static void main(String[] args) {
		FactoryAnimal factoryAnimal = new FactoryAnimal();
		IFactory cat = factoryAnimal.getAnimal("Dog");
	}
}
