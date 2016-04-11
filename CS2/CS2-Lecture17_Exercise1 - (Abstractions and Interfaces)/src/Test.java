
public class Test {

	public static void main(String[] args) {
		Tiger t = new Tiger(300);
		Cat c = new Cat(8);
		
		System.out.println("Tiger Weight: " + t.getWeight());
		System.out.println("Tiger Sound: " + t.sound());
		
		System.out.println("Cat Weight: " + c.getWeight());
		System.out.println("Cat Sound: " + c.sound());
		
	}

}
