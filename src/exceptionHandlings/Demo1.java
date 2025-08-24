package exceptionHandlings;

public class Demo1 {
public static void main(String[] args) {
	int x=10;
	int y=0;
	try {
		System.out.println(x/y);
		System.out.println(x%y);
	}
	catch(Exception e) {
		System.out.println("Dont intialize zero with y..");
	}
	System.out.println("End of Program");
}
}
