import java.util.Scanner;

public class L31_E1 {

	public static void main(String[] args) {
		
		Rectangle recA = new Rectangle();
		Rectangle recB = new Rectangle();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== Rectangle A ===");
		
		System.out.print("Enter a length: ");
		recA.length = input.nextDouble();
		
		System.out.print("Enter a width: ");
		recA.width = input.nextDouble();
		
		System.out.println("=== Rectangle B ===");
		
		System.out.print("Enter a length: ");
		recB.length = input.nextDouble();
		
		System.out.print("Enter a width: ");
		recB.width = input.nextDouble();
		
		input.close();
		
		double areaA = recA.length * recA.width;
		double areaB = recB.length * recB.width;
		
		System.out.println("Rectangle A's area is " + areaA + " units while Rectangle B's area is " + areaB + " units.");
		
	}

}
