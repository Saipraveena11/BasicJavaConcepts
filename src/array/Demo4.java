package array;

import Class.Person;

public class Demo4 {
public static void main(String[] args) {
	//Object Arrays Method
	Person[] p=new Person[2];
	//initialize each element with new object
	p[0]=new Person();
	p[1]=new Person();
	p[0].name="Srinu";
	p[0].age=25;
	p[0].ph=8765435445L;
	p[1].name="sai";
	p[1].age=23;
	p[1].ph=9876545673L;
	for(int i=0;i<p.length;i++) {
		System.out.println(p[i].name);
		System.out.println(p[i].age);
		System.out.println(p[i].ph);
	}
	
}
}
