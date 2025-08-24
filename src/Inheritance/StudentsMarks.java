package Inheritance;

public class StudentsMarks extends Student {//Child class
	int m1,m2,m3;
	public void setMarks(int m1,int m2,int m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void getMarks() {
		System.out.println("Total Marks "+(m1+m2+m3));
		System.out.println("Average is "+(m1+m2+m3)/3);
	}

}
