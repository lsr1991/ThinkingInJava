package me.lsr.thinkinginjava.practice0509;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (RMB money : RMB.values()) {
			System.out.println(money + " " + money.ordinal());
		}
	}

}
