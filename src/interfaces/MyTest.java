package interfaces;

public class MyTest {
	public static void main(String[] args) {
		//MyInter m1=new MyInter();//we can't access abstract classes directly
		MyClass m1=new MyClass();
		m1.display(100);
		//System.out.println(m1.PI);--The static field MyInter.PI should be accessed in a static way
		System.out.println(MyInter.PI);
	}

}
