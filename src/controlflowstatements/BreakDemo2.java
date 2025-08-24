package controlflowstatements;

public class BreakDemo2 {
public static void main(String[] args) {
	//using label--> it is used to exit a specific out block or block of code
		sai:
			for(int j=0;j<=10;j++) {
				for(int i=0;i<=10;i++) {
					if(i==5) {
						break sai;
					}
					else {
						System.out.println(j+"\t"+i);
					}
				}
			}
			System.out.println("End of the program...");
}
}
