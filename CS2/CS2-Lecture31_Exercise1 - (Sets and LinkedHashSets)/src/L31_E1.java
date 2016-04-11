import java.util.LinkedHashSet;
import java.util.Set;

public class L31_E1 {

	public static void main(String[] args) {
		
		Set<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("London");
		lhs.add("Paris");
		lhs.add("San Francisco");
		lhs.add("New York");
		lhs.add("Taipei");
		lhs.add("Paris");
		
		System.out.println(lhs);
		
		for(String e : lhs){
			System.out.print(e.toLowerCase() + ", ");
		}
	}
}