
public class GenericMethodExample {

	public static void main(String[] args) {
		Integer[] scores = {89, 73, 65, 97, 92, 83};
		String[] names = {"David", "Paul", "Michael", "Roger", "Linda", "Mary"};
		
		print(scores);
		print(names);	
	}

	public static <E> void print(E[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}