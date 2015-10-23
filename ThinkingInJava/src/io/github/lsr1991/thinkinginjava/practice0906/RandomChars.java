package io.github.lsr1991.thinkinginjava.practice0906;

import java.util.Random;

public class RandomChars {

	private static Random random = new Random(47);
	private static final int totalChar = 94;
	public char next() {
		return (char)(random.nextInt(totalChar) + 33);
	}
	
	public static void main(String[] args) {
		RandomChars csg = new RandomChars();
		for (int i = 0; i < 10; i ++) {
			System.out.print(csg.next());
		}
	}
}
