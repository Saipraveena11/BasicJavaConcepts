package Inheritance;

public class ClassTwo  extends ClassOne{
	int a;
	//super---> is a keyword cum operator which will refer to
		//current class parents reference
	ClassTwo(){
		super(3);//--->means it calls parents constructor
		System.out.println("This is Two's Constructor");
	}
	ClassTwo(int b){
		System.out.println("b's here "+b);
	}
	void putA(int a) {
		this.a=a;
	}
	void Display() {
		System.out.println("a is "+super.a);//it calls parents variable value
	}
	void getA() {
		System.out.println("Hello....here a value is "+a);
		System.out.println("Hello....here a value is "+super.a);
	}

}
