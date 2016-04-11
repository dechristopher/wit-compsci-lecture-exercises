
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
	 * @return the driangle's dimensions: base, height, and area
	 */
	public String toString(){
		String tri = String.format("base: %.3f units, ", base);
		tri += String.format("height: %.3f units, ", height);
		tri += String.format("area: %.3f units.%n", area());
		
		return tri;
	}
}
