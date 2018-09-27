package abstract_factory;


public class main {

	public static void main(String[] args) {
		
		AbstractFactory data = FactoryProducer.getFactory("FactoryColor");
		
		
		IFactoryColor red = data.getColor("Red");
		
	}
}
