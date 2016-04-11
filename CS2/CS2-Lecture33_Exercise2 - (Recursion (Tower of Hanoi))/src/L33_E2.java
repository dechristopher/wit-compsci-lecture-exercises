import java.util.Scanner;

public class L33_E2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("# of disks: ");
		
		int n = input.nextInt();
		
		System.out.println("The moves are: ");
		moveDisks(n, 'A', 'B', 'C');
		input.close();
	}
	
	public static void moveDisks(int n, char from, char to, char aux){
		if(n == 1){
			System.out.println("Move disk " + n + " from " + from + " to " + to);
		}else{
			moveDisks(n - 1, from, aux, to);
			System.out.println("Move disk " + n + " from " + from + " to " + to);
			moveDisks(n-1, aux, to, from);
		}
	}

}
