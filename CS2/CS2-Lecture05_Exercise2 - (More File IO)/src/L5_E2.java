import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L5_E2 {

	public static void main(String[] args) {
		
		try (PrintWriter output = new PrintWriter(new File("hunnit.txt"))) {
			for (int i = 1; i <= 100; i++) {
				output.println(i);
			}
		} catch (FileNotFoundException fnfex) {
			fnfex.getStackTrace();
			System.out.println("File hunnit.txt was not found!");
			System.exit(0);
		}
		
	}

}
