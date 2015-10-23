package io.github.lsr1991.thinkinginjava.practice0909;

import static io.github.lsr1991.util.Print.*;

public class Console {
	
	public static void beginGame(GameFactory fact) {
		Game game = fact.getGame();
		game.begin();
	}
	
	public static void main(String[] args) {
		beginGame(new CoinTossingFactory());
		beginGame(new DiceFactory());
	}
}

interface GameFactory {
	Game getGame();
}

interface Game {
	void begin();
}

class CoinTossing implements Game {
	public void begin() {
		println("coin tossing");
	}
}

class Dice implements Game {
	public void begin() {
		println("dice");
	}
}

class CoinTossingFactory implements GameFactory {
	public Game getGame() {
		return new CoinTossing();
	}
}

class DiceFactory implements GameFactory {
	public Game getGame() {
		return new Dice();
	}
}