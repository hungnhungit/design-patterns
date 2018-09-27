package decorator;

public abstract class AnimalDecorator implements IAnimal{
	protected IAnimal IAnimalDecorator;
	
	public AnimalDecorator(IAnimal IAnimalDecorator) {
		this.IAnimalDecorator = IAnimalDecorator;
	}
	
}
