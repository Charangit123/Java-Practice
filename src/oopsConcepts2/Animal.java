package oopsConcepts2;

public abstract class Animal {
	
	Animal(){
		
		System.out.println("Printing constructor class of Animal ");
	}

	public abstract void method2();

	public void method1() {
		System.out.println(" method1 animal");
	}

}
// 100% abstarction classes can be called an interface
// Partial interface in a class can be achieved by abstract keyword
// Abstraction the process of hiding the implementation details. 