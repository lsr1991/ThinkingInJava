package io.github.lsr1991.thinkinginjava.practice0903;

public class StringTransformerProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		Apply.process(new StringTransformerAdapter(new StringTransformer()), str);
	}

}
