package javaexam;

public class A {
	public int getNumber(int a){
		return a+1;
	}
}
class B extends A{
	public int getNumber(int a ,char c){
		
		return a+2;
	}
	public static void main(String args[]){
		B b=new B();
		System.out.println(b.getNumber(0,'c'));
	}
}
