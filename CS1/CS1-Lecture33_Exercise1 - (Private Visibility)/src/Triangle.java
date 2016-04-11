
public class Triangle {
	
	//Private dimensions of the triangle.
	private double base;
	private double height;
	
	/**
	 * 
	 * @param b - base of the triangle
	 * @func set the base of the triangle
	 */
	public void setBase(double b){
		base = b;
	}
	
	/**
	 * 
	 * @param h - height of the triangle
	 * @func set the height of the triangle
	 */
	public void setHeight(double h){
		height = h;
	}
	
	/**
	 * 
	 * @return the area of the triangle
	 */
	public double area(){
		return (0.5 * base) * height;
	}
	
	/**
	 * 
	 * @func print the triangle's dimensions and area to the console
	 */
	public void print(){
		System.out.printf("The base of the triangle is %.3f units.%n", base);
		System.out.printf("The height of the triangle is %.3f units.%n", height);
		System.out.printf("The area of the triangle is %.3f units.%n", area());
	}
}
