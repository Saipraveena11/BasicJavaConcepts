package Polymorphism;

public class Sum {
	//overloading-->multiple methods in same class have same name and different parameters.
	public void add(int x,int y) {
		System.out.println("Sum is "+(x+y));
	}
	public void add(int x,int y,int z) {
		System.out.println("Sum is "+(x+y+z));
	}
	public void add(long x,long y) {
		System.out.println("Sum is "+(x+y));
	}
	public void add(String a,String b) {
		System.out.println("Sum is "+(a+b));
	}
	
}
