package interfaces;

public interface MyInter {
	//inerfaces-->is a reference type similar to class that can contains constants
	//fields,abstract methods,default methods...
	//this is for 100% abstraction.
		double PI=3.14;// by default it was considered as -->static final double pi=3.14
							// final--> can't modify the particular variable or method.
		void display(int a);//abstract method---> by default it is taken as abstract
					//syntax--->abstract public void display(int a);
}
