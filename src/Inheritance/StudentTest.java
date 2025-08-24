package Inheritance;

public class StudentTest {
	public static void main(String[] args) {
		//StudentsMarks s1=new StudentsMarks();
		StudentLeaves s1=new StudentLeaves();
		s1.setDetails(67, "Praveena");
		s1.getDetails();
		s1.setMarks(34,56,67);
		s1.getMarks();
		s1.setLeaves(3, 4);
		s1.getLeaves();
	}

}
