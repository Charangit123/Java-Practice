package oopsConcepts2;

public class Honda extends Car{ //"has-a relationship"

	
	//Overriding -- when same method is present in parent class and child class with same name and same number of arguments

	
	public  void start() {		//Overridden method
		System.out.println("Honda-- Start --child");
	}
	
	public void theftsafety() {
		
		System.out.println("Honda-Theftsaftey");
	}
}
