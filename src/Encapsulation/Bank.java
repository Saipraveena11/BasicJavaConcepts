package Encapsulation;

public class Bank {
	
	private double balance=10000.0;
	public double getBalance(int pin) {
		if(pin==7689) {
		return balance;
	}
		else {
			System.out.println("Incorrect pin entered");
			return 0.0;
		}
	}
	public void setBalance(double deposit) {
		balance=balance+deposit;
	}

}
