import java.util.Scanner;

public class Permutations {

	static int permnum = 1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("[Print all permutations of a string]");
		System.out.print("Input >> ");
		String in = input.nextLine();

		input.close();

		perm("", in);
	}

	private static void perm(String prefix, String in) {
		int inl = in.length();
		if (inl == 0) {
			System.out.println("[" + permnum + "] " + prefix);
			permnum++;
		} else {
			for (int i = 0; i < inl; i++) {
				perm(prefix + in.charAt(i), in.substring(0, i) + in.substring(i + 1, inl));
			}
		}
	}
}
