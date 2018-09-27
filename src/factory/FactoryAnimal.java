package factory;

public class FactoryAnimal {
	public IFactory getAnimal(String typeAnimal) {
		switch (typeAnimal) {
		case "Cat":
			new Cat();
			break;
		case "Dog":
			new Dog();
		default:
			break;
		}
		return null;
	}
}
