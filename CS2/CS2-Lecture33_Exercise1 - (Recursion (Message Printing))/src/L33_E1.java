import java.util.Scanner;

public class L33_E1 {
	
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print(">> ");
			int n = input.nextInt();
			
			printMsg(n);
			
			input.close();
		}
		
		public static void printMsg(int n){
			if(n == 0){
				return;
			}else if(n == 1){
				System.out.println( n + " > The message.");
			}else{
				printMsg(n - 1);
				System.out.println(n + " > The message.");
			}
		}
}
