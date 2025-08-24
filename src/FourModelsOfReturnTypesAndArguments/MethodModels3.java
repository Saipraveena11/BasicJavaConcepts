package FourModelsOfReturnTypesAndArguments;

import java.util.Scanner;

public class MethodModels3 {
		//Methods with no return type and having arguments
		public static void main(String[] args) {
			MethodModels3 obj=new MethodModels3();
			System.out.println("Enter the value of n");
			Scanner input=new Scanner(System.in);
			int n= input.nextInt();
			obj.natSum(n);
		}
		public void natSum(int n) {
			int res=n*(n+1)/2;
			System.out.println("Sum of "+n+"is "+res);
		}
}
