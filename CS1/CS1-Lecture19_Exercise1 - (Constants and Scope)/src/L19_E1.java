import java.util.Scanner;

public class L19_E1 {

	public static final int C = 299792458;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double m, e;
		
		System.out.print("Enter a mass (grams): ");
		m = input.nextDouble();
		
		System.out.print("Enter an energy (Joules): ");
		e = input.nextDouble();
		
		input.close();
		
		System.out.printf("The energy calculated from the given mass is: %.3f J%n", calcEnergy(m));
		System.out.printf("The mass calculated from the given energy is: %.10f g%n", calcMass(e));
		
	}
	
	public static double calcEnergy(double m){
		double e;
		e = m * Math.pow(C, 2);
		return e;
	}
	
	public static double calcMass(double e){
		double m;
		m = e / (Math.pow(C, 2));
		return m;
	}

}
