package io.github.lsr1991.thinkinginjava.practice0708;

import static io.github.lsr1991.util.Print.*;

public class MainClass {

	public static final A a = new A();
	
	public final A a2 = new A();
	
	public final A a3;
	
	public MainClass() {
		a3 = new A();
//!		a3 = new A(); The final field a3 may already have been assigned
	}
	
	public void seta3(A newa3) {
//!		a3 = newa3; The final field MainClass.a3 cannot be assigned
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc1 = new MainClass();
		MainClass mc2 = new MainClass();
		println("mc1: " + "a=" + mc1.a.toString() + ";" + "a2=" + mc1.a2.toString());
		println("mc2: " + "a=" + mc2.a.toString() + ";" + "a2=" + mc2.a2.toString());
//!		mc1.a3 = new A(); The final field MainClass.a3 cannot be assigned
		A a2 = new A2();
		a2.whichShow2();
	}

}

class A {
	
	private void show(){
		println("A.show()");
	}
	
	protected void show2() {
		println("A.show2()");
	}
	
	public void whichShow2() {
		show2();
	}
	
	public final void show3() {
		println("A.show3()");
	}
	
}

class A2 extends A{
//	@Override
//!	public void show() { 
//		println("A2.show()");
//	}
//	Error: The method show() of type A2 must override or implement a supertype method
//	because A.show() cannot be accessed from A2
	
	@Override
	public void show2() {
		println("A2.show2()");
	}	
//	because A.show2() can be accessed from A2
	
//	@Override
//!	private void show2() {
//		println("A2.show2()");
//	}
//	Error: Cannot reduce the visibility of the inherited method from A
	
//	@Override
//!	public void show3() {
//		println("A2.show3()");
//	}
//	Error: Cannot override the final method from A
}

final class B {
	
}

//!class B2 extends B {
//	
//}
//Error: The type B2 cannot subclass the final class B