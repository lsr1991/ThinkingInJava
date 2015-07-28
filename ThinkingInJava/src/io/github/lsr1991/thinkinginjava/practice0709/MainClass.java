package io.github.lsr1991.thinkinginjava.practice0709;

import static io.github.lsr1991.util.Print.*;

public class MainClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		A a2 = new A();
		A3.setK();
		A2 a3 = new A3();
		a3.setI(4);
	}

}

class A {
	private static int i = setI(2);
	static int setI(int j) {
		println("A.setI(" + j + ")");
		return 1;
	}
}

class A2 extends A {
	private static int i = setI(2);
	static int setI(int j) {
		println("A2.setI(" + j + ")");
		return 1;
	}
	
	static void setK() {
		println("A2.setK()");
	}
}

class A3 extends A2 {
	private static int i = setI(2);
//!	@Override  static method cannot be overrided 
	static int setI(int j) {
		println("A3.setI(" + j + ")");
		return 1;
	}
}
