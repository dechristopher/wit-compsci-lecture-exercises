import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L27_E1 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(4);
		a.add(0, 10);
		a.add(3, 30);
		
		System.out.println("A list of integers in the arrayList: ");
		System.out.println(a);
		
		LinkedList<Object> ll = new LinkedList<>(a);
		ll.add(1, "red");
		ll.removeLast();
		ll.addFirst("green");
		
		System.out.println("Display the linked list backwards: ");
		for(int i = ll.size() - 1; i >= 0; i--){
			System.out.print(ll.get(i) + " ");
		}
	}

}
