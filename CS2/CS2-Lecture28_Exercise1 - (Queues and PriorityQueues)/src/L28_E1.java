import java.util.Collections;
import java.util.PriorityQueue;

public class L28_E1 {

	public static void main(String[] args) {
			
		PriorityQueue<String> q = new PriorityQueue<>();
		
		q.offer("Oklahoma");
		q.offer("Indiana");
		q.offer("Georgia");
		q.offer("Texas");
		
		System.out.println("PriorityQueue using Comparable:");
		while(q.size() > 0){
			if(q.size() == 1){
				System.out.print(q.remove());
			}else{
				System.out.print(q.remove() + ", ");
			}
		}
		
		System.out.println("\n");
		System.out.println("***********************************************");
		System.out.println();
		
		PriorityQueue<String> q2 = new PriorityQueue<>(4, Collections.reverseOrder());
		q2.offer("Oklahoma");
		q2.offer("Indiana");
		q2.offer("Georgia");
		q2.offer("Texas");
		
		System.out.println("PriorityQueue using Comparator:");
		while(q2.size() > 0){
			if(q2.size() == 1){
				System.out.print(q2.remove());
			}else{
				System.out.print(q2.remove() + ", ");
			}
		}
	}

}
