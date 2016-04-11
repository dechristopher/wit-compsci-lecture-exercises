import java.util.Scanner;

public class L23_E1 {

	/**
	 * 
	 * @param args
	 * @input int searchFor - searches array a for inputted value.
	 * @output String whether or not the value exists in the array and the index at which it exists IF it exists.
	 */
	public static void main(String[] args) {
		
		//Instantiate new Scanner instance.
		Scanner input = new Scanner(System.in);
		
		//Declare an integer array and a guess integer.
		int[] a = new int[]{4, 11, -3, 0, 46, 11, 9, -77, 3, 11};
		int searchFor = 0;
		
		//Prompt user for integer input.
		System.out.print("What number shall be searched for?: ");
		searchFor = input.nextInt();
		
		//Close input to suppress warnings.
		input.close();
		
		//Logic - checks if integer exists in array.
		if(searchArray(searchFor, a) > -1){ //true
			System.out.println("The integer " + searchFor + " exists in the array at the index " + searchArray(searchFor, a) + ".");
		}else{ // -1
			System.out.println("The integer " + searchFor + " does not exist in the array.");
		}
		
	}
	
	/**
	 * 
	 * @param int searchFor - integer to search array for
	 * @param int[] a - integer array to check
	 * @return integer i for index of found number OR -1 if number not found in array
	 */
	public static int searchArray(int searchFor, int[] a){
		
		//Iterate through all integers in the array.
		for(int i = 0; i < a.length; i++){
			
			//If the searchFr integer equals a number in the array.
			if(a[i] == searchFor){
				return i;
			}
			
		}
		
		return -1;
		
	}

}
