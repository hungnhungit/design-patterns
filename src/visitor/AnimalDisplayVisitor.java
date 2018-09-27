package visitor;

public class AnimalDisplayVisitor implements AnimalVisitor {

	@Override
	public void toEat(Cat cat) {
		System.out.println("cat cat");
	}
	@Override
	public void toEat(Dog dog) {
		System.out.println("dog dog");
	}

	@Override
	public void toEat(Leading leading) {
		System.out.println("leading leading");
	}

}
