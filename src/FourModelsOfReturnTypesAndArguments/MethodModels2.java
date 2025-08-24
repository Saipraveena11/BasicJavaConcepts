package FourModelsOfReturnTypesAndArguments;

import java.util.Scanner;

public class MethodModels2 {
	//Method with return type and no arguments
	public static void main(String[] args) {
			MethodModels2 obj=new MethodModels2();
			int res1=obj.natSum();//to access non static method  we need to create object
			System.out.println("result is  "+res1);
		}
		public int natSum() {
			System.out.print("Enter the value of n");
			Scanner obj=new Scanner(System.in);
			int n=obj.nextInt();
			int res=n*(n+1)/2;
			
			return res;
	}
}
