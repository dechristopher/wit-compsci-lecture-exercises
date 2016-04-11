import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L5_E1 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(new File("input.zoz"))) {
			for (int i = 0; i < 5; i++) {
				System.out.println(input.nextInt());
			}
		} catch (FileNotFoundException fnfex) {
			fnfex.getStackTrace();
			System.out.println("File input.zoz was not found!");
			System.exit(0);
		} catch (InputMismatchException imex) {
			imex.getStackTrace();
			System.out.println("A non-integer was scanned!");
			System.exit(0);
		} catch (ArrayIndexOutOfBoundsException aioobex) {
			aioobex.getStackTrace();
			System.out.println("Not enough integers were available!");
			System.exit(0);
		}

	}

}
