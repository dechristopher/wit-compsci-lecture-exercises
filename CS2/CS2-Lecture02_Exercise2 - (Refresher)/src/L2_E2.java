import java.util.Scanner;

public class L2_E2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double dec;
		
		System.out.print("Enter a number with decimal value: ");
		dec = input.nextDouble();
		
		input.close();
		
		System.out.printf("%.3f%n", dec);
	}

}
