package oopsConcepts1;

public class ThisKeyword {
//this keyword is used to store value of local variable to classvariable if the variables are of same name;
//if different variable is presnt this can be used 	
	String tree = "classtree";
	static int y = 1;

	public static void main(String[] args) {

		ThisKeyword obj = new ThisKeyword();
		System.out.println("in main method");
		System.out.println(obj.tree);
		obj.method(9, "tree value");

		System.out.println(obj.tree+"      "+obj.y);
	}

	public void method(int y, String tree) {
		this.tree = tree;
		this.y=y;
		System.out.println("Values in method");

		System.out.println(y + tree);
	}

}
