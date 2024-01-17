import java.io.*;
import java.util.*;

class LinkedListExample{
	public static void main (String[] args) throws IOException{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("India");
		ll.add("America");
		ll.add("China");
		ll.add("Pakistan");
		System.out.println("Linked list if elements"+ll);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position,choice=0;
		while(choice<4){
			System.out.println("Linked List Operation");
			System.out.println("1.Add an element");
			System.out.println("2.Remove an element");
			System.out.println("3.Change an element");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice= Integer.parseInt(br.readLine());
			switch(choice){
				case 1:
					System.out.println("Enter Element");
					element=br.readLine();
					System.out.println("At what position");
					position = Integer.parseInt(br.readLine());
					ll.add(position-1,element);
					System.out.println(element);
					System.out.println(ll);
					break;
				case 2:
					System.out.println("At what position");
					position = Integer.parseInt(br.readLine());
					ll.remove(position-1);
					break;
				case 3:
					
					System.out.println("At what position");
					position = Integer.parseInt(br.readLine());
					System.out.println("Enter new Element");
					element=br.readLine();
					ll.set(position-1,element);
					break;
				default:
					return;
			}
		}
		Iterator it= ll.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}
}