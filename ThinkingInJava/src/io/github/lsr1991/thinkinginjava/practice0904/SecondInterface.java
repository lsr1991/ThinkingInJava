package io.github.lsr1991.thinkinginjava.practice0904;

public interface SecondInterface extends FirstInterface, ThirdInterface {
	void second();
}
// one interface can extend from more than one interface

interface SecondInterface2 extends FirstInterface, ThirdInterface {
	void second2();
}

interface ThirdInterface {
	void third();
}

