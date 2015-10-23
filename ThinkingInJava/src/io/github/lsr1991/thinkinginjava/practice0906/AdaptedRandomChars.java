package io.github.lsr1991.thinkinginjava.practice0906;

import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChars extends RandomChars implements Readable{

	private int count;
	
	public AdaptedRandomChars(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1;
		}
		cb.append(next());
		cb.append(" ");
		return 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new AdaptedRandomChars(10));
		while (s.hasNext()) {
			System.out.print(s.next() + " ");
		}
	}

}
