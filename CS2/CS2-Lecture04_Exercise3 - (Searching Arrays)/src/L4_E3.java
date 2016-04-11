import java.util.Scanner;

public class L4_E3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[]{
				4,11,-3,0,46,11,9,-77,3,11
		};
		
		System.out.print("Enter a value to search the array for: ");
		int val = input.nextInt();
		
		input.close();
		
		int found = searchArray(val, a);
		
		if(found != -1){
			System.out.println("The value " + val + " was found at array index [" + found + "].");
		}else{
			System.out.println("The value was not found in the array!");
		}

	}
	
	public static int searchArray(int val, int[] a){
		
		int index = -1;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == val){
				index = i;
				return index;
			}
		}
		
		return index;
	}

}
