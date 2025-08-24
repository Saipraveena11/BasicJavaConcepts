package array;

public class TwoDimentionalArray {
public static void main(String[] args) {
	String[][] data=new String[2][4];
	System.out.println("Lenght of array"+data.length);
	System.out.println("Lenght of row1 is "+data[0].length);
	System.out.println("Lenght of row2 is "+data[1].length);
	data[0][0]="reyaz";
	data[0][1]="reyaz123";
	data[0][2]="reyaz s";
	data[0][3]="abc@gmail.com";
	
	data[1][0]="ravi";
	data[1][1]="ravi123";
	data[1][2]="ravi k";
	data[1][3]="xyz@gmail.com";
	
	for(int i=0;i<data.length;i++) {
		for(int j=0;j<data[i].length;j++) {
			System.out.print(data[i][j]+"\t");
		}
		System.out.println();
	}
}
}
