package Encapsulation;

public class Clock {
	private int hr,min,sec;
//	public void setClock(int a,int b,int c) {
//		hr=a;
//		min=b;
//		sec=c;
//	}
	public void setClock(int hr,int min,int sec) {
		this.hr=hr;//this--> is represents current calling object reference
		this.min=min;//means obj.hr-->this.hr
		this.sec=sec;
	}
	
	public void getClock() {
		System.out.printf("%02d:%02d:%02d",hr,min,sec);
	}
}
