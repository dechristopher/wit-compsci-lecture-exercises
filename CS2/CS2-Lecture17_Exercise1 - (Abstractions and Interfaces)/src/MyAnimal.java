
public abstract class MyAnimal{
	
	protected int weight;
	protected String sound;
	
	protected MyAnimal(){
		weight = 10;
	}
	
	protected MyAnimal(int weight){
		this.weight = weight;
	}
	
	protected int getWeight(){
		return this.weight;
	}
	
	abstract String sound();
	
}
