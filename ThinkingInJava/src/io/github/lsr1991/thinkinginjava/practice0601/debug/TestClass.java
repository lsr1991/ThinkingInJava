package io.github.lsr1991.thinkinginjava.practice0601.debug;

import static io.github.lsr1991.util.Print.*;

public class TestClass {
	public static void debug(Object... args) {
		for (Object i : args) {
			println(i);
		}
	}
}
