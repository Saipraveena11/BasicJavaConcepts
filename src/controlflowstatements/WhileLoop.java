package controlflowstatements;

import java.util.Scanner;

public class WhileLoop {
 public static void main(String[] args) {
	 
	 Scanner input=new Scanner(System.in);
	 while(true) {
		 System.out.println("Enter some character:");
		 char ch=input.next().charAt(0);//here takes only one digit number--> index'0'
		 if(ch !='x' && ch !='X') {
			 System.out.println("You have entered "+ch+" Characters");
		 }
		 else {
			 System.out.println("Entered X...Game Over...");
			 break;
		 }
	 }
 }
}
