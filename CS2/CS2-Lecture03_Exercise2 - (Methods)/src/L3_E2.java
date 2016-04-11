import java.util.Scanner;

public class L3_E2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double d = getDouble(input);
		
		System.out.printf("Got double: %.3f%n", d);
	}
	
	public static double getDouble(Scanner scanner){
		System.out.print("Enter a double: ");
		return scanner.nextDouble();
	}

}
