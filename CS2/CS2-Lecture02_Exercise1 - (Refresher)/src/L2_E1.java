import java.util.Scanner;

public class L2_E1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double d1,d2,d3, avg;
		
		System.out.print("First number: ");
		d1 = input.nextDouble();
		System.out.print("Second number: ");
		d2 = input.nextDouble();
		System.out.print("Third number: ");
		d3 = input.nextDouble();
		
		input.close();
		
		avg = (d1 + d2 + d3) / 3.0;
		
		System.out.printf("Average:  %.2f%n", avg);

	}

}
