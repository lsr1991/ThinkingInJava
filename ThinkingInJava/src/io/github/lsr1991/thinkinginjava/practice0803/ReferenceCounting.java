package io.github.lsr1991.thinkinginjava.practice0803;

import static io.github.lsr1991.util.Print.*;

public class ReferenceCounting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Shared shared = new Shared();
		Composing[] composings = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for (Composing c : composings) {
			c.dispose();
		}
//		System.gc();  does not work
		for (int i = 0; i < 1000000; i ++) {
			new ConsumeMemory();
		}
		Thread.sleep(5000);
		println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
	}
}

class Shared {
	private long refCount = 0;
	private final long id = counter++;
	private static long counter = 0;

	public Shared() {
		println("create Shared " + id);
	}

	public void addRef() {
		refCount++;
	}

	public void dispose() {
		if (--refCount == 0) {
			println("dispose Shared " + id);
		}
	}
	
	@Override
	protected void finalize() {
		println("finalize()");
		if (refCount == 0) {
			println("Shared " + id + " already dispose");
		}
	}
}

class Composing {
	private Shared shared;
	private final long id = counter++;
	private static long counter = 0;

	public Composing(Shared shared) {
		println("create Composing " + id);
		this.shared = shared;
		this.shared.addRef();
	}

	public void dispose() {
		println("dispose Composing " + id);
		shared.dispose();
	}
}

class ConsumeMemory {
	long[] i = new long[100];
	{
		for (long x : i) {
			x = 1;
		}
	}
}