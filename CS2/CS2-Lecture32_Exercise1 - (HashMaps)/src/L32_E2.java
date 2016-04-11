import java.util.HashMap;

public class L32_E2 {

	public static void main(String[] args) {
		HashMap<String, Object> dishes = new HashMap<String, Object>();
		HashMap<String, Integer> hams = new HashMap<String, Integer>();
		dishes.put("ham", hams);
			hams.put("Stop & Shop Ham", 3);
			hams.put("Polish Ham", 9);
			hams.put("Awesome Ham", 5);
		dishes.put("turkey", 25);
		dishes.put("corn", 3);
		dishes.put("pie", 7);
		dishes.put("bread", 4);
		
		printDishes(dishes);
		
		System.out.println("Changed price of pie to $9.");
		dishes.replace("pie", 9);
		
		printDishes(dishes);
	}
	
	@SuppressWarnings("unchecked")
	public static void printDishes(HashMap<String, Object> dishes){
		System.out.println("<---Menu--->");
		for(String keyMenuMap : dishes.keySet()){
			if(keyMenuMap == "ham"){
				System.out.println("hams --->");
				HashMap<String, Integer> hamsMap = (HashMap<String, Integer>) dishes.get("ham");
				for(String hamMenuMap : hamsMap.keySet()){
					System.out.println("---> " + hamMenuMap + " ---> $" + hamsMap.get(hamMenuMap));
				}
			}else{
				System.out.println(keyMenuMap + " ---> $" + dishes.get(keyMenuMap));
			}
		}
		System.out.println();
	}
	
}
