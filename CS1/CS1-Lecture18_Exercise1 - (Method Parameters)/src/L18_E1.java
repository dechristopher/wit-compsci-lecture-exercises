import java.util.Scanner;

public class L18_E1 {

	public static void main(String[] args) {
		
		//Declare double dbl.
		double dbl;
		
		//Instantiate new scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Assign return value of method getDouble to double dbl.
		dbl = getDouble(input);
		
		//Print out the gotten value of dbl.
		System.out.println("You have entered: " + dbl);
		
	}
	
	//Double getter method.
	public static Double getDouble(Scanner input){
		
		//Declare double dbl
		double dbl;
		
		//Prompt user for input.
		System.out.print("Enter a double: ");
		
		//Assign value of user input to dbl.
		dbl = input.nextDouble();
		
		//Return value of dbl.
		return dbl;
		
	}

}
