package exceptionHandlings;

import java.util.Scanner;

public class VoterRegistrationApp {
	public static void main(String[] args) {
		//using throw method--> user created Exception
		System.out.println("Welocme to Voting Registration website...");
		System.out.println("----------------------------------------------------");
		System.out.println("Enter Details ob below-->");
		System.out.println("enter your age:");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("Please proceed with your registration..");
		}
		else {
			try {
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("End of the program..");		
	}

}
