package Encapsulation;

public class Customer {
	public static void main(String[] args) {
		Bank obj=new Bank();
		//System.out.println("Total balance is "+obj.balance);---> balace variable  is private variable so we can't access directly
		System.out.println("Total balance is "+obj.getBalance(7689));
		obj.setBalance(20000);
		System.out.println("Total balance is "+obj.getBalance(7689));
	}

}
