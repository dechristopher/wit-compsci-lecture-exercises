
public class L21_E1 {

	public static void main(String[] args) {
		
		//Declare new integer array with length of 1000
		int[] i = new int[1000];
		
		//Initiate a for loop that assigns the values 1 to 1000 to each element of the array.
		for(int n = 0; n < i.length; n++){
			
			//Assign value
			i[n] = n+1;
			
			//Output
			System.out.println(i[n]);
					
		}

	}

}
