package io.github.lsr1991.thinkinginjava.practice0909;

public interface Cycle {
	void move();
}

interface CycleFactory {
	Cycle getCycle();
}