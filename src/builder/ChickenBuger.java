package builder;

public class ChickenBuger extends Buger{
	@Override
	public void eat() {
		System.out.println("Eat ChickedBuger");
	}

	@Override
	public String name() {
		
		return "ChickedBuger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 12;
	}
}
