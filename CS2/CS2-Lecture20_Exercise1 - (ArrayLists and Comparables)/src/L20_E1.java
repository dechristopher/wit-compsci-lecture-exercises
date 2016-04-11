import java.util.ArrayList;

public class L20_E1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(14);
		a.add(24);
		a.add(4);
		a.add(42);
		a.add(5);
		
		System.out.println("Max: " + L20_E1.<Integer>max(a));

	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> list){
		E max = list.get(0);
		
		for(int i = 1; i < list.size(); i++){
			if(list.get(i).compareTo(max) > 0){
				max = list.get(i);
			}
		}
		
		return max;
	}

}
