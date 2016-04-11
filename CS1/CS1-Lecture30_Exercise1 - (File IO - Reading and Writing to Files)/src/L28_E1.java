import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L28_E1 {

	public static void main(String[] args) {
		
		//Declare some variables.
		String currLine = "";
		int length = 0;
		int line = 1;
		
		//Try to instantiate a new Scanner File instance and a new Print Writer instance.
		try(Scanner fin = new Scanner(new File("jediCode.txt"));PrintWriter fout = new PrintWriter(new File("lineCounts.txt"))){
			
			//While the input file still has lines to scan...
			while(fin.hasNextLine()){
				
				//Grab the next line...
				currLine = fin.nextLine();
				
				//Grab the length of the line...
				length = currLine.length();
				
				//Print output to the console.
				System.out.println("Line " + line + ": " + length + " characters");
				
				//Print output to output file.
				fout.println("Line " + line + ": " + length + " characters");
				
				//Iterate the line number.
				line += 1;
				
			}
			
		//If the input file doesn't exist.	
		} catch (FileNotFoundException e) {
			//Rut ro raggie.
			System.out.println("File not found!");
		}

	}

}
