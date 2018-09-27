package abstract_factory;

public class FactoryColor extends AbstractFactory {
	
	public FactoryColor() {
		System.out.println("FactoryColor");
	}
	
	@Override
	public IFactoryColor getColor(String typeColor) {
		switch (typeColor) {
		case "Red":
			return new Red();
		case "Green":
			return new Green();
		default:
			break;
		}
		return null;
	}


	@Override
	public IFactoryAnimal getAnimal(String typeAnimal) {
		// TODO Auto-generated method stub
		return null;
	}
}
