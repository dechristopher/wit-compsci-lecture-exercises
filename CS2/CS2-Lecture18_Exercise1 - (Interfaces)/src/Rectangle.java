
public class Rectangle implements Measurable {

	private double myWidth;
	private double myHeight;
	
	public Rectangle(double w, double h){
		this.myWidth = w;
		this.myHeight = h;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (this.myWidth + this.myHeight);
	}

	@Override
	public double getArea() {
		return myWidth * myHeight;
	}

}
