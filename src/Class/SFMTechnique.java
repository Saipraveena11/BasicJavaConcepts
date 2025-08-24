package Class;

public class SFMTechnique {
	//SFM- Static Factory Method
	// if any method of the class is static, and that method returns the same class.
		String name;
		int age;
		public static SFMTechnique getPerson() {
			return new SFMTechnique();
		}
}
