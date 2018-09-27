package visitor;

public class Dog implements IAnimal{

	@Override
	public void eat(AnimalVisitor animalVisitor) {
		animalVisitor.toEat(this);
	}

}
