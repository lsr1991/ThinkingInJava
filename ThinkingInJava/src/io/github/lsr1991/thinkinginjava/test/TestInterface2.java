package io.github.lsr1991.thinkinginjava.test;

import static io.github.lsr1991.util.Print.*;

public class TestInterface2 implements TestInterface {

	public String name() {
		return this.getClass().getSimpleName();
	}
	
	public int getI() {
		return this.i;
	}
	
//!	public void setI() {
//		this.i = 2;
//	}
//	i in the interface is a final field
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println(new TestInterface2().getI());
		println(TestInterface2.i);
	}

}
