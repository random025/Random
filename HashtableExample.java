import java.util.*;
class HashtableExample{
	public static void main(String args[]){
		Hashtable<String,Integer> ht= new Hashtable<String,Integer>();
		ht.put("Rohit",99);
		ht.put("Kohli",76);
		ht.put("Dhoni",70);
		ht.put("Aswin",88);
		System.out.println("Player Names Using Enumeration");
		Enumeration e=ht.keys();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		Set s= ht.keySet();
		System.out.println("Hash tables keys" +s);
		System.out.println("Remove of Hashtable"+ ht.remove("Aswin"));
		System.out.println("Hash table elements are:"+ht);
             System.out.println(" ");
		System.out.println("size of Hash table"+ht.size());
	}
}