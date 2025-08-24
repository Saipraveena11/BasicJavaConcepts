package exceptionHandlings;

import Class.Person;

public class ExceptionHandlingDemo2 extends NullPointerException{
	public static void main(String[] args) {
		//Try with multiple catches
		int x=10;
		int y=2;
		//int y=0;
		Person p=new Person();
		p=null;
		try {
			System.out.println(x/y);
			System.out.println(x%y);
			System.out.println(p.name);
		}
		catch(NullPointerException e){
			System.out.println(e.getMessage());
			System.out.println("Don't give null to person object");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Dont intialize zero with y..");
		}
	}

}
