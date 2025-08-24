package controlflowstatements;

import java.util.Scanner;

public class DoWhileLoop {
public static void main(String[] args) {
	String uName=null;
	String pwd=null;
	do {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Username");
		uName=input.next();
		System.out.println("Enter Password");
		pwd=input.next();
		if(uName.equals("reyaz0806") && pwd.equals("reyaz123")) {
			System.out.println("Welcome to hotel booking page..");
			break;
		}
		else {
			System.out.println("Incorrect Credentials");
		}
	}while(true);
}
}
