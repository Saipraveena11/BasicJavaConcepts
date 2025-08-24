package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		
		List a=new ArrayList();
		System.out.println(a.size());
		a.add("FLM");
		a.add(9856445434L);
		a.add('A');
		System.out.println(a.size());
		System.out.println(a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
