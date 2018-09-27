package abstract_factory;

public abstract class AbstractFactory {
	 abstract IFactoryAnimal getAnimal(String typeAnimal);
	 abstract IFactoryColor getColor(String typeColor);
}
