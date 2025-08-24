package Class;

public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println("Person name is "+p1.name);
		System.out.println("Person age is "+p1.age);
		System.out.println("phone number"+p1.ph);
		p1.name="Sai";
		p1.age=23;
		p1.ph=9864554454L;
		p1.greet();
		System.out.println("Person name is "+p1.name);
		System.out.println("Person age is "+p1.age);
		System.out.println("phone number"+p1.ph);
	}
}
