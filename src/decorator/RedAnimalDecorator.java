package decorator;

public class RedAnimalDecorator extends AnimalDecorator {

	public RedAnimalDecorator(IAnimal IAnimalDecorator) {
		super(IAnimalDecorator);
	}

	@Override
	public void eat() {
		IAnimalDecorator.eat();
		setRedBorder(IAnimalDecorator);
	}
	private void setRedBorder(IAnimal decoratedShape) {
		System.out.println("Border Color: Red");
	}
}
