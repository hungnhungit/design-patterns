package visitor;

public interface AnimalVisitor {
	public void toEat(Cat cat);
	public void toEat(Dog dog);
	public void toEat(Leading leading);
	
}
