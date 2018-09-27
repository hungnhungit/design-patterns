package strategy;

public class Context {
	Strategy context;
	public Context(Strategy context) {
		this.context = context;
	}
	public int test(int num1,int num2) {
		return this.context.doOperation(num1, num2);
	}
}
