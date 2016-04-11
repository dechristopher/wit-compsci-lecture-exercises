
public class Triangle {
	public double base;
	public double height;
	
	public double area(){
		return (0.5 * base) * height;
	}
	
	public void print(){
		System.out.printf("The base of the triangle is %.3f units.%n", base);
		System.out.printf("The height of the triangle is %.3f units.%n", height);
	}
}
