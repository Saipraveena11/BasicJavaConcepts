package Inheritance;

public class Student {
	//Single inheritance
	int rollNo;
	String sName;
	public void setDetails(int rollNo,String sName) {
		this.rollNo=rollNo;
		this.sName=sName;
				
	}
	public void getDetails() {
		System.out.println("Roll No "+rollNo+" Student Name "+sName);
	}
	
}
