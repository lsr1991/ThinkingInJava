package io.github.lsr1991.thinkinginjava.practice0702;

import static io.github.lsr1991.util.Print.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new A3();
		new D();
	}

}

class A {
	public A() {
		println("A()");
	}
}

class A2 extends A {
	public A2() {
		println("A2()");
	}
}

class A3 extends A2 {
}

class B {
	private int x = 1;
	public B(int i) {
		println("B(" + i + ")");
	}
}

class C {
	public C() {
		println("C()");
	}
}

class D extends B {
	C c = new C();

	public D() {
		super(1);
		println("D()");
		
	}

}