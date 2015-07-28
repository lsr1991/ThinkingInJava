package io.github.lsr1991.thinkinginjava.practice0803;

import static io.github.lsr1991.util.Print.*;

class Glyph {
	  void draw() { println("Glyph.draw()"); }
	  Glyph() {
	    println("Glyph() before draw()");
	    draw();
	    println("Glyph() after draw()");
	  }
	}	

	class RoundGlyph extends Glyph {
	  private int radius = 1;
	  RoundGlyph(int r) {
	    radius = r;
	    println("RoundGlyph.RoundGlyph(), radius = " + radius);
	  }
	  void draw() {
	    println("RoundGlyph.draw(), radius = " + radius);
	  }
	}	
	
	class RectangleGlyph extends Glyph {
		private int length = 2;
		private int width = 1;
		RectangleGlyph(int l, int w) {
			length = l;
			width = w;
			println("RectangleGlyph(), length = " + length + ", width = " + width);
		}
		void draw () {
			println("RectangleGlyph.draw(), length = " + length + ", width = " + width);
		}
	}

	public class PolyConstructors {
	  public static void main(String[] args) {
	    new RectangleGlyph(3,1);
	  }
	} /* Output:
	Glyph() before draw()
	RoundGlyph.draw(), radius = 0
	Glyph() after draw()
	RoundGlyph.RoundGlyph(), radius = 5
	*/