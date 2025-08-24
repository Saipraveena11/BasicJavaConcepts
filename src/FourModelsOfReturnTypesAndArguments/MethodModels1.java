package FourModelsOfReturnTypesAndArguments;

import java.util.Scanner;

public class MethodModels1 {
	//Methods without return type and arguments
	public static void main(String[] args) {
		MethodModels1 obj=new MethodModels1();
		obj.natSum();//to access non static method  we need to create object
	}
	public void natSum() {
		System.out.print("Enter the value of n");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int res=n*(n+1)/2;
		System.out.println("Sum of "+n+"is "+res);
		
}
}
