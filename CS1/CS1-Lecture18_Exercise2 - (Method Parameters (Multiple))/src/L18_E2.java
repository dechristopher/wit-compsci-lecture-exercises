import java.util.Scanner;

public class L18_E2 {
	
	public static void main(String[] args) {
		
		//Declare double and String variables.
		double side1, side2, area;
		String units;
		
		//Instantiate new Scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Declare program functionality.
		System.out.println("Enter the side lengths of a rectangle to calculate its area.");

		//Prompt user for first side length.
		System.out.print("Enter the length of side 1: ");
		side1 = input.nextDouble();
		
		//Prompt user for second side length.
		System.out.print("Enter the length of side 2: ");
		side2 = input.nextDouble();
		
		System.out.println("What is your unit of measurement?");
		units = input.next();
		
		//Close input to suppress warnings.
		input.close();
		
		//Call calcArea() and assign return value to the double area.
		area = calcArea(side1, side2);
		
		//Print final calculated area.
		System.out.printf("The area of the rectangle is: %.3f " + units + ".%n", area);
		
	}
	
	//Calculate Area Method - Takes two double arguments.
	public static double calcArea(double side1, double side2){
		
		//Returns the product of side1 and side 2.
		return (side1 * side2);
		
	}

}
