package visitor;

public class main {
	public static void main(String[] args) {

		IAnimal animal = new Animal();
		animal.eat(new AnimalDisplayVisitor());
	}
}
