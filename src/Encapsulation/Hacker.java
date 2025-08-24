package Encapsulation;

public class Hacker {
		public static void main(String[] args) {
			Bank b1=new Bank();
			System.out.println("Hacked money is  "+b1.getBalance(1234));
		}
}
