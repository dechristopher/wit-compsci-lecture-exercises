import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L27_E2 {

	public static void main(String[] args) {
		
		//Instantiate a new file instance of the file numbers.txt
		File f = new File("numbers.txt");
		
		//Try to instantiate a new printwriter using the file instantiated above
		try(PrintWriter fout = new PrintWriter(f)){
			
			//Iterate 100 times to print out the numbers 1 to 100
			for(int i = 1; i <= 100; i++){
				fout.println(i);
				System.out.println("--> Integer " + i + " written to file " + f.getName() + " <--");
			}
			
		//Throw an error and terminste the program if the file numbers.txt doesn't exist.
		}catch(FileNotFoundException ex){
			System.out.println("File " + f.getName() + " does not exist.");
			System.exit(0);
		}

	}

}
