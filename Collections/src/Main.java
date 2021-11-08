import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {

	public static void main(String[] args) {
		/*LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Apple");
		fruits.add("Bananna");
		fruits.add("Mango");
		fruits.add("Mango");
		System.out.println(fruits);
		fruits.addFirst("Strawberry");
		fruits.addLast("Blueberry");
		System.out.println("The element is " + fruits.get(4));
		ListIterator<String> iterator = fruits.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(fruits.size());
		HashSet<String> mySet = new HashSet<String>();
		mySet.add("Five");
		mySet.add("Four");
		mySet.add("One");
		mySet.add("Two");
		mySet.add("Three");
		mySet.add("One");
		mySet.add("Six");
		Iterator<String> iterator = mySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		Queue<String> line = new PriorityQueue<String>();
		line.add("heena");
		line.add("aaron");
		line.add("zebra");
		System.out.println(line);
		System.out.println(line.poll());
		System.out.println(line);
		System.out.println(line.element());
		int a=10, b=20, c=30;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		
		happy.put("a", a);
		happy.put("b", b);
		happy.put("c", c);
		System.out.println(happy);
		happy.remove("a");
		System.out.println(happy);
		*/
		HashMap<String, String> happy1 = new HashMap<String, String>();
		happy1.put("abc", "pass123");
		happy1.put("xyz", "pass256");
		happy1.put("car", "pass567");
		happy1.put("new", "change");
		happy1.put("new", "feature"); 
		
		System.out.println(happy1.get("abc"));
		System.out.println(happy1.containsValue("pass256"));
		System.out.println(happy1.containsKey("abc"));
		happy1.put("car", "pass666");
		System.out.println(happy1.keySet());
		System.out.println(happy1.get("car"));



		
		
	}

}
