package io.github.lsr1991.thinkinginjava.practice0909;

import static io.github.lsr1991.util.Print.*;

public class MainClass {

	public static void cycleGame(CycleFactory cycleFact) {
		Cycle cycle = cycleFact.getCycle();
		cycle.move();
		cycle.move();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cycleGame(new UnicycleFactory());
		cycleGame(new BicycleFactory());
		cycleGame(new TricycleFactory());
	}

}

class Unicycle implements Cycle {
	public void move() { println("unicycle move"); }
}

class Bicycle implements Cycle {
	public void move() { println("bicycle move"); }
}

class Tricycle implements Cycle {
	public void move() { println("tricycle move"); }
}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}