import java.util.Iterator;
import java.util.PriorityQueue;
class priorityQueueExample{
	public static void main(String Args[]){
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("USA");
		pq.add("Australia");
		pq.add("Nepal");
		System.out.println(pq);
		Iterator it= pq.iterator();
		System.out.println("Elements using Iterator");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}