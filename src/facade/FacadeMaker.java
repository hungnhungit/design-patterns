package facade;

public class FacadeMaker {
	private Cat cat;
	private Dog dog;
	private Ability ability;
	
	public FacadeMaker() {
		cat = new Cat();
		dog = new Dog();
		ability = new Ability();
	}
	public void eatCat() {
		cat.eat();
	}
}
