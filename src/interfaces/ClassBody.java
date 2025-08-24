package interfaces;

public class ClassBody implements ClassA,ClassB,ClassC{//Multiple inheritance
	public void greet() {// we should add "public" key word to implement abstract method
		System.out.println("hi...");
	}
	public void wish() {
		System.out.println("HBD...");
	}
	public void bye() {
		System.out.println("bye...");
	}

}
