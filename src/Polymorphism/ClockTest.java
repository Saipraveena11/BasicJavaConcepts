package Polymorphism;

public class ClockTest {
	public static void main(String[] args) {
//		Clock c1=new Clock();
//		c1.getClock();-->default constructor only called when it was exists.
		Clock c1=new Clock(9);
		c1.getClock();
		Clock c2=new Clock(9,10);
		c2.getClock();
		Clock c3=new Clock(9,10,50);
		c3.getClock();
		
//		c1.setClock(2);
//		c1.setClock(2,45);
//		c1.setClock(2,45,36);
		
		
	}

}
