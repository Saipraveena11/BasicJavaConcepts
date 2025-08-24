package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4UsingIterator {
	public static void main(String[] args) {
		List<String> listOfStudents=new ArrayList<String>();
		listOfStudents.add("Anuja");
		listOfStudents.add("Amar");
		listOfStudents.add("Asha");
		listOfStudents.add("Venkat");
		//listOfStudents.add(8765476543L);**The method add(String) in the type List<String> is not applicable for the arguments (long)
		listOfStudents.add("Mohan");
		System.out.println("Using For Loop");
		for(int i=0;i<listOfStudents.size();i++) {
			System.out.println(listOfStudents.get(i));
	}
		//Using remove() method
		listOfStudents.remove("Venkat");
		
		//using for Each loop
		System.out.println("Using For Each Loop");
		for(String temp:listOfStudents) {
			System.out.println(temp);
		}
		
		//using Iterator()
		System.out.println("Using Iterator Loop");
		Iterator<String> it=listOfStudents.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
	}
}
