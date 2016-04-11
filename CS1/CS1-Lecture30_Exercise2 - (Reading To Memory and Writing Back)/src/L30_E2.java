import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L30_E2 {
	
	public static void main(String[] args){
		
		//Instantiate a new Scanner instance for user input.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the names of an input file and an output file
		System.out.print("Enter a file to copy from: ");
		String inputFile = input.nextLine();
		System.out.print("Enter a file to copy to: ");
		String outputFile = input.nextLine();
		
		//Close the Scanner to suppress warnings.
		input.close();
		
		//Try to instantiate a new Scanner instance for file input and a new PrintWriter instance for file output
		try(
				Scanner fin = new Scanner(new File(inputFile));
				PrintWriter fout = new PrintWriter(new File(outputFile));
		){
			
			//Call the copy method
			copy(fin, fout);
			
		//If either file doesn't exist, throw an error and terminate the program
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
		
	}
	
	/**
	 * 
	 * @param fin - the file input Scanner
	 * @param fout - the file output PrintWriter
	 */
	public static void copy(Scanner fin, PrintWriter fout){
		
		//Declare a string for the current line of the Scanner.
		String line = "";
		
		//Loop through every line in the input file and print it to the console and write it to the output file
		while(fin.hasNextLine()){
			line = fin.nextLine();
			fout.println(line);
		}
		
	}
	
}
