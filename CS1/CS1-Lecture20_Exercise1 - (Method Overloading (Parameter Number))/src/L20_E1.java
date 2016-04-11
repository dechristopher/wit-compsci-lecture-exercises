import java.util.Scanner;

public class L20_E1 {

	public static void main(String[] args) {
		
		//Instantiate a new Scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Declare some doubles.
		double r, l, w;
		
		//Prompt user for radius, length, and width.
		System.out.print("Enter the radius: ");
		r = input.nextDouble();
		System.out.print("Enter the length: ");
		l = input.nextDouble();
		System.out.print("Enter the width: ");
		w = input.nextDouble();
		
		//Close input to suppress warnings.
		input.close();
		
		//Output area of a circle and area of a rectangle.
		System.out.printf("Area of a circle with radius of " + r + " inches: %.3f inches squared.%n", area(r));
		System.out.println("Area of a rectangle with side lengths " + l + " and " + w + " inches: " + area(l, w) + " inches squared.");

	}
	
	//First overloaded method used for finding the area of a circle based on a single given parameter, radius.
	public static double area(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
	
	//Second overloaded method used for finding the area of a rectangle based on two given parameters, length and width.
	public static double area(double l, double w){
		return l * w;
	}
	
}
