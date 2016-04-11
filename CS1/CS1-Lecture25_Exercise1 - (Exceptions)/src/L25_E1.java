import java.util.InputMismatchException;
import java.util.Scanner;

public class L25_E1 {
	
	/**
	 * 
	 * @param args
	 * @func Divides integers with remainder output.
	 */
	public static void main(String[] args){
		
		//Instantiate new Scanner instnce.
		Scanner input = new Scanner(System.in);
		
		//Declare ints x and y.
		int x = 0, y = 0;
		
		//Main program loop.
		while(true){
			
			//Try to ask user for input and find the qutient and remainder
			try{
				
				//Prompt for x
				System.out.print("Enter a number:");
				x = input.nextInt();
				
				//Prompt for y
				System.out.print("Enter a second number: ");
				y = input.nextInt();
				
				//Run x/y and x%y and output result.
				System.out.printf("Quotient: " + quotient(x,y) + "." + remainder(x,y) + "%n%n");
				
			//Catch if user doesn't input integers.
			}catch(InputMismatchException ex){
				
				//Print erorr
				System.out.println("Either x or y wasn't a number.");
				
				//Close input to suppress warnings.
				input.close();
				
				//Close program loop.
				return;
				
			//Catch if user inputs 0 as their y value.	
			}catch(ArithmeticException ex){
				
				//Print erorr
				System.out.println("Cannot divide by 0.");
				
				//Close input to suppress warnings.
				input.close();
				
				//Close program loop.
				return;
				
			}
			
		}
		
	}
	
	/**
	 * 
	 * @param int x
	 * @param int y
	 * @return int x/y
	 */
	public static int quotient(int x, int y){
		
		//Divide x by y
		return x/y;
	
	}
	
	/**
	 * 
	 * @param int x
	 * @param int y
	 * @return int x%y
	 */
	public static int remainder(int x, int y){
		
		//x mod y
		return x%y;
		
	}

}
