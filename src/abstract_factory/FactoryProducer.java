package abstract_factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String Factory) {
		switch (Factory) {
		case "FactoryColor":
			return new FactoryColor();
		case "FactoryAnimal":
			return new FactoryAnimal();
		default:
			break;
		}
		return null;
	}
}
