import java.util.Scanner;

public class L17_E2 {
	
	public static void main(String[] args) {
		
		System.out.println("~ Exponent Calculator ~");
		
		double base = getBase();
		double exp = getExp();
		
		System.out.printf("%.0f%n", pow(base, exp));

	}
	
	public static double getBase(){
		Scanner baseInput = new Scanner(System.in);
		System.out.print("Enter a base: ");
		double base = baseInput.nextDouble();
		baseInput.close();
		return base;
		
	}
	
	public static double getExp(){
		Scanner expInput = new Scanner(System.in);
		System.out.print("Enter an exponent: ");
		double exp = expInput.nextDouble();
		expInput.close();
		return exp;
		
	}
	
	public static double pow(double base, double exp){
		
		double pow = Math.pow(base,  exp);
		return pow;
		
	}
	
	public static int getInt(){
		Scanner intInput = new Scanner(System.in);
		System.out.print("Input an integer"); 
		int number = intInput.nextInt();
		intInput.close();
		return number;
	}

}