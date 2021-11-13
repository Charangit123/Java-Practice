package oopsConcepts1;

public class Constructor_Super_Concept extends ParentConstroctor {

	//Constructor is a default method and called when obj is created;
	//when obj is created it also calls parent calss default class constructors
	//super: super is used when we have to call parent calss constructor having parameters. 
	
	
	public Constructor_Super_Concept(){	
		System.out.println("defalut construtor or hidden constructor with no parameters");
	}
	
	
	Constructor_Super_Concept(int i){
		super(10);
		System.out.println("child class constructor with one parameter");
	}
	
	Constructor_Super_Concept(int i,String name){
		super(10,"para2");
		System.out.println("child class constructor with two parameters::"+i+name);
	}
	
	public static void main(String[] args) {
		Constructor_Super_Concept obj=new Constructor_Super_Concept();
		Constructor_Super_Concept obj1=new Constructor_Super_Concept(20);
		Constructor_Super_Concept obj2=new Constructor_Super_Concept(100, "raju");
	
	}

}
