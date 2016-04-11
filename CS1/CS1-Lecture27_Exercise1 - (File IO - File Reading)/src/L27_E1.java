import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L27_E1 {

	/**
	 * 
	 * @param args
	 * @func take file input and print out all numbers contained as either even or odd.
	 */
	public static void main(String[] args) {
		
		//Declare filename
		String filename = "numbers";
		
		//Instantiate numbers.txt as a new File type.
		File f = new File(filename + ".txt");
		
		//Instantiate a new Scanner instance from the File numbers.txt.
		try(Scanner fin = new Scanner(f)){
			
			//While there are more lines to scan...
			while(fin.hasNextLine()){
				
				//Declare new int with value of nextInt().
				int i = fin.nextInt();
				
				//If scanned integer is even...
				if((i % 2) == 0){
					//Print output - number is even.
					System.out.println("The integer " + i + " is even.");
				//If scanned integer is odd...
				}else{
					//Print output - number os odd.
					System.out.println("The integer " + i + " is odd.");
				}
				
			}
			
		//If File numbers.txt does not exist...
		}catch(FileNotFoundException ex){
			//Print error handling message.
			System.out.println("File " + f.getName() + " was not found!");
			//Terminate application.
			System.exit(0);
		}

	}

}
