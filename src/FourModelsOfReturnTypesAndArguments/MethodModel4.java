package FourModelsOfReturnTypesAndArguments;

import java.util.Scanner;

public class MethodModel4 {
		// Method having return type and arguments
		public static void main(String[] args) {
			MethodModel4 obj=new MethodModel4();
			System.out.println("Enter the value of n");
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			int res=obj.natSum(n);
			System.out.println("Sum of "+n+"is "+res);
				
		}
		public int natSum(int n) {
			int sum=n*(n+1)/2;
			return sum;
		}
}
