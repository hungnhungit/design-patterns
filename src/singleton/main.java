package singleton;

public class main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getIntance();
		singleton.showMessage();
	}
}
