package array;

public class UsingForEachLoop {
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=20;
		a[1]=30;
		a[2]=40;
		a[3]=50;
		a[4]=60;
		System.out.println("Using For Loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Using For Each Loop");
		for(int temp:a) {
			System.out.println(temp);
		}
		
	}

}
