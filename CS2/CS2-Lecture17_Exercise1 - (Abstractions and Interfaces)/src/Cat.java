
public class Cat extends MyAnimal {	
	
	protected Cat(int weight) {
		super(weight);
	}

	@Override
	String sound() {
		return "Meow!";
	}

}
