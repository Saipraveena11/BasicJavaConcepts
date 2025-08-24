package abstraction;

public class NumbersSum  extends Numbers{
	void compute(int x,int y) {
		System.out.println("Sum is "+(x+y));//Giving body for abstract method
	}
	void m1() { 
		// all abstact methods must use in child class atleast empty
		//otherwise child class should be abstract untill all methods used
	}
	void m2(String a) {
		
	}
}
