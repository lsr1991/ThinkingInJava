package io.github.lsr1991.thinkinginjava.practice0903;

public class StringTransformerAdapter implements Processor {
	
	private StringTransformer st;
	
	public StringTransformerAdapter(StringTransformer st) {
		this.st = st;
	}
	
	public String name() {
		return this.st.name(); 
	}
	
	public String process(Object input) {
		return this.st.transform((String)input);
	}
}
