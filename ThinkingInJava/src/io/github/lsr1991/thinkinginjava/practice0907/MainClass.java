package io.github.lsr1991.thinkinginjava.practice0907;

public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//!		TestInterface.i = 2; // The final field TestInterface.i cannot be assigned
		System.out.println(TestInterface.i); // only static field can be got with Class method call
	}

}
