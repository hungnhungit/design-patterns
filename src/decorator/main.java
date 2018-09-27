package decorator;

public class main {

	public static void main(String[] args) {
		
		IAnimal colorCat= new RedAnimalDecorator(new Cat());
		colorCat.eat();

	}

}
