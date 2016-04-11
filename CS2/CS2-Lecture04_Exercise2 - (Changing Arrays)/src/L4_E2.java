
public class L4_E2 {

	public static void main(String[] args) {
		
		int[] a = new int[]{
				1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
		};
		
		System.out.println("Initial Array:");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + ", ");
		}
		
		add(a, 1);
		
		System.out.println("");
		System.out.println("Added 1 to array:");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + ", ");
		}

	}
	
	public static void add(int[] a, int amt){
		for(int i = 0; i < a.length; i++){
			a[i] += amt;
		}
	}

}
