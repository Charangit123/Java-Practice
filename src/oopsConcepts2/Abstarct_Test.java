package oopsConcepts2;

public class Abstarct_Test extends Animal {

	Abstarct_Test(){
		System.out.println("conctroctor class of Child");
	}
	
	public static void main(String[] args) {
		
		
		Animal obj = new Abstarct_Test();
		obj.method2();
		obj.method1();
	}

	@Override
	public void method2() {
		System.out.println("In overridden method2");

	}
// final keyword is used to not override a method.and doesnt allow to extend a class/interface.. and can't change the variable names
}
