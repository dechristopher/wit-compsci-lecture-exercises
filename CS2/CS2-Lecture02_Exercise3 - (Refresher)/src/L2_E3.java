import java.util.Scanner;

public class L2_E3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int val;
		
		do{
			
			System.out.println("Enter a number between 1 and 100: ");
			val = input.nextInt();
			
		}while(val > 100 || val < 1);
		
		input.close();

	}

}
