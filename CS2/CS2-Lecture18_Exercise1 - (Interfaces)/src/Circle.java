
public class Circle implements Measurable {

	private double myRadius;
	
	public Circle(double r){
		myRadius = r;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.myRadius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.myRadius, 2);
	}

}
