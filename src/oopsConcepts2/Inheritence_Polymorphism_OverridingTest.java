package oopsConcepts2;

public class Inheritence_Polymorphism_OverridingTest {

	public static void main(String[] args) {
	
		//static polymorphism or compile-time polymorphism
		Honda h = new Honda();
		h.start();  // Overridden method od Honda class
		h.theftsafety();
		h.stop();
		h.refuel();
		h.engine();
		System.out.println("######################");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("#############################");
		
		//Run-Time Polymorphism or Dynamic Polymorphism
		//Child Class object can be referred by Parent Class reference varaible called dynamic polymorphism
	
		//Top-Casting
		Car ch = new Honda();
		ch.refuel();
		ch.start();  //Overridden method (child class)
		ch.stop();
		ch.engine();
		//ch.theftsafety(); // cant access child METHODS with Parent reference object.

		
		//Down Casting
	//		Honda hc= (Honda) new Car();
	//		hc.start(); //ClassCastException
	}
	//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

}
