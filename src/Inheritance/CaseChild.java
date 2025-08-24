package Inheritance;

public class CaseChild extends CaseParent {
	protected int x=20;//overriding
	void m1(){//overriding
		System.out.println("this is child's m1 method");
	}
	void greet(String name) {//overriding
		System.out.println("Hi "+name+"...Whatzapp???");
	}
}
