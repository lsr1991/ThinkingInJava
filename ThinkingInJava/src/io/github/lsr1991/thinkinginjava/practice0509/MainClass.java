package io.github.lsr1991.thinkinginjava.practice0509;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (RMB money : RMB.values()) {
			switch (money) {
			case ONE:
				System.out.println("this is 1 yuan.");
				break;
			case FIVE:
				System.out.println("this is 5 yuan.");
				break;
			case TEN:
				System.out.println("this is 10 yuan.");
				break;
			case TWENTY:
				System.out.println("this is 10 yuan.");
				break;
			case FIFTY:
				System.out.println("this is 50 yuan.");
				break;
			case HUNDRED:
				System.out.println("this is 100 yuan.");
				break;
			default:
				System.out.println("this is ???.");
			}
			System.out.println(money + " " + money.ordinal());
		}
	}

}
