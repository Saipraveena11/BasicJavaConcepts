package variables;

public class StaticVar {
	static int j;
	public static void main(String[] args) {
		StaticVar.j=12;
		
		System.out.println("value of j is "+StaticVar.j);
	}

}
