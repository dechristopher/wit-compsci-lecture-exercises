import java.util.Scanner;

public class L15_E1 {

	public static void main(String[] args) {
		
		//Instantiate new scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter a number.
		System.out.print("Enter a number: ");
		
		//Declare variables num and ber.
		int num = 0, ber = input.nextInt();
		
		//CLose input to suppress warnings.
		input.close();

		//While loop that prints out all values of num up to ber.
		while(num <= ber){
			System.out.println(num);
			num++;
		}
		
	}

}