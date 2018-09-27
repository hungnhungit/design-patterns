package bridge;

public class Cat extends Animal{

	private String name;
	
	public Cat(String name,ColorApi color) {
		super(color);
		this.name = name;
		System.out.println("Cat color api");
	}
	public void show() {
		System.out.println("test");
	}
}
