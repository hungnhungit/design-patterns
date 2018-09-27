package strategy;

public class main {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.test(1, 2));
	}	
	
}
