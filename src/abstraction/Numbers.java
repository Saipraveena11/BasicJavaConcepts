package abstraction;

public abstract class Numbers {
	//Abstraction-->process of hiding the implementation details and
		//only showing essential details or features to user.
		abstract void compute(int x,int y);
		abstract void m1();
		abstract void m2(String s1);
		void greet() {
			System.out.println("Hi...");
		}
}
