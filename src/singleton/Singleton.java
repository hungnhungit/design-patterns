package singleton;

public class Singleton {

	private static Singleton intance;

	public Singleton() {
		System.out.println("Tester Singleton");
	}
	
	public static Singleton getIntance() {

		if (intance == null) {
			return new Singleton();
		}
		return intance;
	}
	
	public void showMessage() {
		System.out.println("Message Tester");
	}

}
