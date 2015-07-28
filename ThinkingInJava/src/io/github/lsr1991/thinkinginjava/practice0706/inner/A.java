package io.github.lsr1991.thinkinginjava.practice0706.inner;

import static io.github.lsr1991.util.Print.*;

public class A {
	
	private String name;
	
	protected void setName(String name) {
		this.name = name;
		println("A.setName");
	}
	
	public A(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
	}
}
