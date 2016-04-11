import java.util.Scanner;

public class L32_E1 {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Triangle Base: ");
		tri.base = input.nextDouble();
		System.out.print("Triangle Height: ");
		tri.height = input.nextDouble();
		
		input.close();
		
		tri.print();
		
		System.out.printf("A triangle with base of %.3f units and a height of %.3f units has an area of %.3f units.%n", tri.base, tri.height, tri.area());
		
	}

}
