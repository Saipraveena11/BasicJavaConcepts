package controlflowstatements;

public class BreakDemo1 {
	public static void main(String[] args) {
		for(int j=0;j<=10;j++) {
			if(j==5) {
				break;
			}
			for(int i=0;i<=10;i++) {
				if(i==5) {
					break;
				}
				else {
					System.out.println(j+"\t"+i);
				}
			}
		}
		System.out.println("End of the program...");
	}
}
