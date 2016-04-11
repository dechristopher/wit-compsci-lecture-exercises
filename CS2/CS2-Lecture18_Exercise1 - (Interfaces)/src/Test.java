
public class Test {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(3, 4);
		
		System.out.println("Circle area: " + c.getArea() + " | Circle perimeter: " + c.getPerimeter());
		System.out.println("Rectangle area: " + r.getArea() + " | Rectangle perimeter: " + r.getPerimeter());

	}

}
