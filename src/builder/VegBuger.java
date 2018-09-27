package builder;

public class VegBuger extends Buger {

	@Override
	public void eat() {
		System.out.println("Eat VegBuger");
	}

	@Override
	public String name() {
		return "VegBuger";
	}

	@Override
	public float price() {
		return 12;
	}

}
