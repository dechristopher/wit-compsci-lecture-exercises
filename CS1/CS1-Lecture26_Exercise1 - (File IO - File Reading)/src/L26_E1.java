import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L26_E1	{
	
	public static void main(String[]cargs){
		try	(Scanner fin =	new	Scanner(new	File("integers.txt"))){
			for	(int i = 1;	i <= 5; i++){
				
				int nextInt	= fin.nextInt();
				System.out.println(nextInt);
				
			}
		}
		catch(FileNotFoundException ex){
			
			System.out.println("File integers.txt not found!");
			System.exit(0);
			
		}
	}
}