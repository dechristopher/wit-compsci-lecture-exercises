import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class L23_E1 {

	public static void main(String[] args) {
		
			Collection<String> fruit = new ArrayList<>();
			
			fruit.add("Pineapple");
			fruit.add("Banana");
			fruit.add("Orange");
			fruit.add("Apple");
			fruit.add("Watermellon");
			
			Iterator<String> i = fruit.iterator();
			
			while(i.hasNext()){
				String element = i.next();
				if(element.contains("an")){
					System.out.print(element + " ");
				}
			}
			
			System.out.println();

	}

}
