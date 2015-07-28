package io.github.lsr1991.thinkinginjava.practice0706.outer;

import io.github.lsr1991.thinkinginjava.practice0706.inner.A;
import static io.github.lsr1991.util.Print.*;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A("lin");
//!		a.setName("chen"); cannot access 
		A2 a2 = new A2("lin", 2);
		a2.setName("chen");
	}

}

class A2 extends A {
	private int number;
	public A2(String name, int number) {
		super(name);
		this.number = number;
	}
	public void setNameAndNumber(String name, int number) {
		super.setName(name);
		this.number = number;
	}
	
	public void setName(String name) {
		super.setName(name);
		println("A2.setName");
	}
}
