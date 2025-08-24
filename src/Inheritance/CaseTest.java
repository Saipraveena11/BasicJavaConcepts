package Inheritance;

public class CaseTest {
	public static void main(String[] args) {
		//case1-->no method overriding happened
//		CaseParent p1=new CaseParent();
		//case2-->overriding happened
		//CaseChild p1=new CaseChild();
		//case3-->invalid type
		//CaseChild p1=new CaseParent();
		//case4--> object for child class,reference of Parent class-->Valid case
		CaseParent p1=new CaseChild();
		p1.m1();
		p1.greet("Meena");
		System.out.println(p1.x);//Protected variables are inherited by subclasses, 
		//allowing them to be used directly in the subclass
	}
}
