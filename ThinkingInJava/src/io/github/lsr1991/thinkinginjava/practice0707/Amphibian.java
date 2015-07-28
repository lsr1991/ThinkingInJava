package io.github.lsr1991.thinkinginjava.practice0707;

import static io.github.lsr1991.util.Print.*;

public class Amphibian {

	public void swim() {
		println("Amphibian.swim");
	}
	
	public void crawl() {
		println("Amphibian.crawl");
	}
	
	public static void active(Amphibian amp) {
		amp.crawl();
		amp.swim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog = new Frog();
		Amphibian.active(frog);
	}

}

class Frog extends Amphibian {
	
	public void swim() {
		println("Frog.swimming");
	}
	
//	public void crawl() {
//		println("Frog.crawl");
//	}
	
	public void jump() {
		println("jump");
	}
	
}