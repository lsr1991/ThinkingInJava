package io.github.lsr1991.thinkinginjava.practice0903;

import static io.github.lsr1991.util.Print.*;

public class Apply {

	public static void process(Processor p, Object s) {
		println("Using Processor " + p.name());
		println(p.process(s));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
