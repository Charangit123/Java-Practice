package oopsConcepts1;

public class Car_Class {

	int mod; 		// Global variables or Class Variables
	int wheel;
	
	public static void main(String[] args) {
		
		//1. new Car_Class is the object
		//2. a,b,c are object reference variables of the Car_Class
		// 3. new keyword is used to create an object
		Car_Class a= new Car_Class();
		Car_Class b= new Car_Class();
		Car_Class c = new Car_Class();
		
		//when we create an object with Class all the non static methods and variables are referred to Objects(a,b,c)
		a.mod=2019;
		a.wheel=4;
		
		b.mod=2017;
		b.wheel=5;
		
		c.mod=2018;
		c.wheel=3;
		
		//before reference 
	
		System.out.println(a.mod);		//2019 
		System.out.println(b.wheel);	//5
		System.out.println(c.mod);		//2018	
		System.out.println(c.wheel);	//3	
		System.out.println(b.mod);		//2017	
		System.out.println(a.wheel);	//4
		System.out.println("################################");
	//after reference	
		a=b;  // b values are gone to a
		b=c;	// c values are gone to b
		c=a;	// now a value is b. so b values are gone to c
		
		System.out.println(a.mod);		//2017  a=b
		System.out.println(b.wheel);	//3		b=c
		System.out.println(c.mod);		//2017	c=a=b
		System.out.println(c.wheel);	//5		c=a=b	
		System.out.println(b.mod);		//2018	b=c
		System.out.println(a.wheel);	//5		a=b
		
		
		
		
		
		
	}

}
