package io.github.lsr1991.thinkinginjava.practice0903;

import static io.github.lsr1991.util.Print.*;

public class StringTransformer {
	
	public String name() {
		return this.getClass().getName();
	}
	
	public String transform(String input) {
		char[] inputArray = input.toCharArray();
		for (int i = 1; i < inputArray.length; i = i + 2) {
			char tmp = inputArray[i];
			inputArray[i] = inputArray[i - 1];
			inputArray[i - 1] = tmp;
		}
		return String.valueOf(inputArray);
	}
	
	public static void main(String[] args) {
		println(new StringTransformer().transform("ab"));
	}
}
