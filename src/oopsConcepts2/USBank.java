package oopsConcepts2;

public interface USBank extends WorldBank {

	int min_bal= 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();

	
public static void ServicesofUS() { // static methods can't be overridden 
	System.out.println("This are the services of US");
	
}

default void internbank() {
	
	System.out.println("Intern of bank ");
}
}

//INTERFACE
//only method declation
//no method body --only method prototype called  ABSTRACT Methods..
//Abstract methods don't have STATIC keyword
//we can declare varaibles in INTERFACE but they are static in nature
//no static method in interface
//No main method in interface
//We can'nt create the object of interface
//Interface is abstract in nature
//Variable values will not be changed, it is Final/Constant  in nature.'
//from jdk 1.8 STATIC ketword is allowed with method body.  
//default method can also be created in interfaces.
