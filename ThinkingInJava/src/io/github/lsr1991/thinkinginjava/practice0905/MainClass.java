package io.github.lsr1991.thinkinginjava.practice0905;

//public class MainClass extends SuperClass implements Combine {
public class MainClass extends AbstractSuperClass implements Combine {
	public void a1() {}
	public void b1() {}
	public void a2() {}
	public void b2() {}
	public void a3() {}
	public void b3() {}
	public void c() {}
	public void s2() {}
	
	public static void getA1(A1 a1) {}
	
	public static void getA2(A2 a2) {}
	
	public static void getA3(A3 a3) {}
	
	public static void getCombine(Combine c) {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m1 = new MainClass();
		MainClass.getA1(m1);
		MainClass.getA2(m1);
		MainClass.getA3(m1);
		MainClass.getCombine(m1);
	}

}


interface A1 {
	void a1();
	void b1();
}

interface A2 {
	void a2();
	void b2();
}

interface A3 {
	void a3();
	void b3();
}

interface Combine extends A1,A2,A3 {
	void c();
}

class SuperClass {
	void s() {}
}

abstract class AbstractSuperClass {
	abstract void s2();
	void s() {}
}

