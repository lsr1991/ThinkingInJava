package io.github.lsr1991.thinkinginjava.practice0904;
//: interfaces/Adventure.java
// Multiple interfaces.

interface CanFight {
  void fight();
}

interface CanSwim {
  void swim();
}

interface CanFly {
  void fly();
}

interface CanClimb {
	void climb();
}

class ActionCharacter {
  public void fight() {}
}	

class ActionCharacter2 {
	public void wearGlasses() {}
}

class Hero extends ActionCharacter
    implements CanFight, CanSwim, CanFly, CanClimb {
  public void swim() {}
  public void fly() {}
  public void climb() {}
}

//!class Hero extends ActionCharacter, ActionCharacter2 {
//	
//}
// one class cannot extend from more than one superclass

public class Adventure {
  public static void t(CanFight x) { x.fight(); }
  public static void u(CanSwim x) { x.swim(); }
  public static void v(CanFly x) { x.fly(); }
  public static void w(ActionCharacter x) { x.fight(); }
  public static void y(CanClimb x) { x.climb(); }
  public static void main(String[] args) {
    Hero h = new Hero();
    t(h); // Treat it as a CanFight
    u(h); // Treat it as a CanSwim
    v(h); // Treat it as a CanFly
    w(h); // Treat it as an ActionCharacter
    y(h);
  }
} ///:~
