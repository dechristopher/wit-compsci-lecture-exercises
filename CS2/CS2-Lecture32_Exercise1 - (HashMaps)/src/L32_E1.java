import java.util.HashMap;

public class L32_E1 {

	public static void main(String[] args) {
		HashMap<String, Integer> mountains = new HashMap<String, Integer>();
		mountains.put("Everest", 29029);
		mountains.put("K2", 28251);
		mountains.put("Kangchenjuanga", 28169);
		mountains.put("Makalu", 27750);
		
		printMap(mountains);
		
		System.out.println("Is Makalu in the map? " + mountains.containsKey("Makalu"));
		System.out.println();
		System.out.println("Change the height of Makalu.");
		mountains.put("Makalu", 27762);
		
		printMap(mountains);
	}
	
	public static void printMap(HashMap<String, Integer> m){
		System.out.println("Map contains: ");
		for(String keyMountainName : m.keySet()){
			Integer height = m.get(keyMountainName);
			System.out.println(keyMountainName + " ---> " + height.intValue() + " feet.");
		}
		System.out.println();
	}

}
