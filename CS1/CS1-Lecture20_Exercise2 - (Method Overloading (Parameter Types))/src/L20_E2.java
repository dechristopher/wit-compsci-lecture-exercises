
public class L20_E2 {

	public static void main(String[] args) {
		
		//Three different method calls for each overloaded method.
		displayResult(5);
		displayResult(6.8);
		displayResult("Sample Text");
		
	}
	
	//displayResult for integers.
	public static void displayResult(int input){
		System.out.printf("Integer: %d%n", input);
	}
	
	//displayResult for doubles.
	public static void displayResult(double input){
		System.out.printf("Double: %.3f%n", input);
	}
	
	//displayResult for Strings.
	public static void displayResult(String input){
		System.out.println("String: " + input);
	}

}
