import java.util.Scanner;

public class L34_E1 {

	public static void main(String[] args) {
		
		//Instantiate a new instance of the Triangle class.
		Triangle tri = new Triangle();
		
		//Instantiate a new Scanner instance for user input.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the triangle's base and set the base using the setBase() method
		System.out.print("Triangle Base: ");
		tri.setBase(input.nextDouble());
		
		//Prompt the user for the triangle's height andset the height using the setHeight() method.
		System.out.print("Triangle Height: ");
		tri.setHeight(input.nextDouble());

		//Close the Scanner to suppress warnings.
		input.close();		
		
		//Print out the triangle's dimensions with a call to the toString method.
		System.out.println("Triangle :: " + tri.toString());

	}

}