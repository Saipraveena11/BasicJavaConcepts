package Polymorphism;

public class Clock {
	int hr,min,sec;
	
//	public Clock() { //this is Constructor -used when we want execute a code automatically while calling the object. 
//		System.out.println("Entered into constructor");
//	}
//	public void setClock(int hr) {
//		this.hr=hr;
//	}
//	public void setClock(int hr,int min) {
//		this.hr=hr;
//		this.min=min;
//	}
//	public void setClock(int hr,int min,int sec) {
//		this.hr=hr;
//		this.min=min;
//		this.sec=sec;
//	this();
//	}
	public Clock(int hr) {
		this.hr=hr;
	}
	public Clock(int hr,int min) {
//		this.hr=hr;
		this(hr);
		this.min=min;
	}
	public Clock(int hr,int min,int sec) {
//		this.hr=hr;
//		this.min=min;
		this(hr,min);
		this.sec=sec;
	}
	public void getClock() {
		System.out.printf("%02d:%02d:%02d\n",hr,min,sec);
	}
}

