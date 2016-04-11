import java.util.Scanner;

public class Factorials {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("[Print the factorial of a number]");
		System.out.print("Input >> ");
		long in = input.nextLong();

		input.close();

		System.out.println(fact(in));
	}

	private static long fact(long in) {
		if(in == 0){
			return 1;
		}else if(in == 1){
			return 1;
		}else{
			return in * fact(in - 1);
		}
	}
}
