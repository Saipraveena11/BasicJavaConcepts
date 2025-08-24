package Inheritance;

public class ClassOne {
		int a;
		ClassOne(){
			System.out.println("This is One's Constructor");
		}
		ClassOne(int b){
			System.out.println("b's here "+b);
		}
		void setA(int a) {
			this.a=a;
		}
		void getA() {
			System.out.println("hi...this is a 's value"+a);
		}
}
