package io.github.lsr1991.thinkinginjava.practice0901;

import static io.github.lsr1991.util.Print.*;

public abstract class Rodent {

	public abstract void bite();
	
	public abstract void eat();
	
	public abstract void crawl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//!		new Rodent(); Error: Cannot instantiate the type Rodent
	}

}

class Mouse extends Rodent {
	public void bite() {
		println("Mouse.bite");
	}
	public void eat() {
		println("Mouse.eat");
	}
	public void crawl() {
		println("Mouse.crawl");
	}
}

class Gerbil extends Rodent {
	public void bite() {
		println("Gerbil.bite");
	}
	public void eat() {
		println("Gerbil.eat");
	}
	public void crawl() {
		println("Gerbil.crawl");
	}
}

class Hamster extends Rodent {
	public void bite() {
		println("Hamster.bite");
	}
	public void eat() {
		println("Hamster.eat");
	}
	public void crawl() {
		println("Hamster.crawl");
	}
}
