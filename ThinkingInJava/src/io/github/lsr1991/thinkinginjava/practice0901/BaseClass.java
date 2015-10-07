package io.github.lsr1991.thinkinginjava.practice0901;

import static io.github.lsr1991.util.Print.*;

public abstract class BaseClass {

	private int i = 1;
	
	public abstract void print();
	
	public BaseClass() {
		print(); 
		// although we cannot create objects of abstract classes, 
		// their constructors will still be called when 
		// objects of sub-classes are created.
		// so, the abstract keyword in the class definition 
		// only limits the creation of objects, while other aspects 
		// remain identical with the non-abstract classes. for example, 
		// abstract classes can have their own non-static fields, and these fields 
		// will also be inherited in the objects of their sub-classes.
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int newI) {
		i = newI;
	}
	
	public static void show(AnotherBaseClass abc) {
//		((AnotherSubClass)abc).print();
		abc.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new SubClass().print();
//		show(new AnotherSubClass());
		SubClass a = new SubClass();
		println(a.getI());
		a.setI(3);
		println(a.getI());
		SubClass b = new SubClass();
		println(b.getI());
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