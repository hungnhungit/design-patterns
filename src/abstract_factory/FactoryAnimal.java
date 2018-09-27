package abstract_factory;

public class FactoryAnimal extends AbstractFactory {
	public IFactoryAnimal getAnimal(String typeAnimal) {
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

	@Override
	public IFactoryColor getColor(String typeColor) {
		return null;
	}
}
