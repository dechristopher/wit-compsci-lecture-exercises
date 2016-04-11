import java.util.Scanner;

public class L22_E1 {

	public static void main(String[] args) {
		
		//Instantiate new Scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Declare int to add and array of initial integers.
		int value;
		int[] a = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		//Output the original array.
		System.out.print("Initial Array: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		//Newline.
		System.out.println("");
		
		//Prompt user for number to add.
		System.out.print("Enter a number to add to each vlaue in the array: ");
		value = input.nextInt();
		
		//Close input to suppress warnings.
		input.close();
		
		//Call the add mmethod.
		addVal(a, value);
		
		//Output new array after the addititon.
		System.out.print("Added 1 Array: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		//Newline.
		System.out.println("");
		
	}
	
	//Add value v to every value in array a.
	public static void addVal(int[] a, int v){
		for(int i = 0; i < a.length; i++){
			a[i] = a[i] + v;
		}
	}

}
