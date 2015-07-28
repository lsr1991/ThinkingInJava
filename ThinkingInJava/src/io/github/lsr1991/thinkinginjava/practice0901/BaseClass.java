package io.github.lsr1991.thinkinginjava.practice0901;

import static io.github.lsr1991.util.Print.*;

public abstract class BaseClass {

	public abstract void print();
	
	public BaseClass() {
		print(); 
		// although we cannot create objects of abstract classes, 
		// their constructors will still be called when 
		// objects of sub-classes are created.
		// so, the abstract keyword in the class definition 
		// only limits the creation of objects. 
	}
	
	public static void show(AnotherBaseClass abc) {
//		((AnotherSubClass)abc).print();
		abc.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new SubClass().print();
		show(new AnotherSubClass());
	}

}

class SubClass extends BaseClass {
	
	private int i = 2;
	
	public void print() {
		println(i);
	}
}

abstract class AnotherBaseClass {
//	public void print() {
//		println("AnotherBaseClass.print()");
//	}
	abstract void print();
}

class AnotherSubClass extends AnotherBaseClass {
	public void print() {
		println("AnotherSubClass.print()");
	}
}