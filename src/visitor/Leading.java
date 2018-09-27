package visitor;

public class Leading implements IAnimal{

	@Override
	public void eat(AnimalVisitor animalVisitor) {
		animalVisitor.toEat(this);
	}

}
