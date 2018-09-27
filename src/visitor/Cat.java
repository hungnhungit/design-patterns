package visitor;

public class Cat implements IAnimal{

	@Override
	public void eat(AnimalVisitor animalVisitor) {
		animalVisitor.toEat(this);
	}

}
