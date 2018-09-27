package builder;

public abstract class Buger implements Item{
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public void eat() {
		System.out.println("Buger eat");
	}
}
