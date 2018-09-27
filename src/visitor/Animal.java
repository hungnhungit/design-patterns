package visitor;

public class Animal implements IAnimal {

	IAnimal[] listAnimal;

	public Animal() {
		this.listAnimal = new IAnimal[] { new Cat(), new Dog(), new Leading() };
	}

	@Override
	public void eat(AnimalVisitor animalVisitor) {
		for (int i = 0; i < listAnimal.length; i++) {
			listAnimal[i].eat(animalVisitor);
		}
	}

}
