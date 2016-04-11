public class L17_E1 {

	public static void main(String[] args) {
		
		double base = 2;
		double exp = 1;
		
		while(exp <= 5){
			
			double pow = Math.pow(base, exp);
			System.out.printf("2^%.0f=%.0f%n", exp, pow);
			exp++;
			
		}
		
	}

}