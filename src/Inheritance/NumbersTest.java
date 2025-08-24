package Inheritance;

public class NumbersTest {
	public static void main(String[] args) {
		NumbersDiv n1=new NumbersDiv();
		n1.setX(8);
		n1.setY(2);
		n1.getX();
		n1.getY();
		n1.div();
		NumbersMul n2=new NumbersMul();
		n2.setX(4);
		n2.setY(3);
		n2.getX();
		n2.getY();
		n2.mul();
		NumbersSub n3=new NumbersSub();
		n3.setX(5);
		n3.setY(2);
		n3.getX();
		n3.getY();
		n3.sub();
		NumbersAdd n4=new NumbersAdd();
		n4.setX(6);
		n4.setY(8);
		n4.getX();
		n4.getY();
		n4.add();
	}

}
