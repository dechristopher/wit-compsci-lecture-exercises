import java.util.Scanner;

public class L15_E2 {

	public static void main(String[] args) {
		
		//Instantiate new Scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Declare an integer called num.
		int num;
		
		//Prompt the user for a number between 1 and 100 until they input said number.
		do{
			System.out.print("Enter a number between 1 and 100: ");
			num = input.nextInt();
		}while(num > 100 || num < 1);
		
		//Close input to suppress warnings.
		input.close();
		
		//Congratulate user for their grand display of intelligence.
		System.out.println("Congratulations, " + num + " is a number between 1 and 100!");
	}

}
