package Inheritance;

public class StudentLeaves extends StudentsMarks {
	//Multi level inheritance A-->B-->C
	int sl,cl;
	public void setLeaves(int sl,int cl) {
		this.sl=sl;
		this.cl=cl;
	}
	public void getLeaves() {
		System.out.println("Total number of leaves Taken "+(sl+cl));
	}
	//---overriding method-->the process of providing replacement for existing
	//functionality with some new functionality
	//---method signature is same
	//---we can override parents properties(methods)
	// in child class and should have a relationship.
	public void getDetails() {
		System.out.println("Roll No is: "+rollNo);
		System.out.println("------------------------");
		System.out.println("Students name is : "+sName);
	}
}
