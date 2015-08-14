package com.basics.accessmodifiers.p1;

public class A {
	int i = 10;
	private int j = 20;
	protected int k = 30;
	public int m = 40;
	
	public static void main(String args[]){
		B b = new B();
		b.show();
	}
}


class B extends A{
	
	void show(){
		System.out.println(i);
		//private member so, compilation err
		//System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}

class C {
	void s1(){
		System.out.println(i);
		//private member so, compilation err
		//System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}




