package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		//Type Safety(same data type) is not present when we initialize a common collection.
		//we should use "Generics" to provide type safety to collection classes
		List<String> listOfStudents=new ArrayList<String>();
		listOfStudents.add("Anuja");
		listOfStudents.add("Amar");
		listOfStudents.add("Asha");
		listOfStudents.add("Venkat");
		//listOfStudents.add(8765476543L);**The method add(String) in the type List<String> is not applicable for the arguments (long)
		listOfStudents.add("Mohan");
		for(int i=0;i<listOfStudents.size();i++) {
			System.out.println(listOfStudents.get(i));
		}
	}

}
