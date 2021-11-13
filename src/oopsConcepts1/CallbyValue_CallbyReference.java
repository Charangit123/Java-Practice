package oopsConcepts1;

public class CallbyValue_CallbyReference {
	int c,d;

	public static void main(String[] args) {
	
		CallbyValue_CallbyReference obj = new CallbyValue_CallbyReference();
		
		obj.c=2;
		obj.d=8;
		
		obj.reference(obj);
		System.out.println(obj.c +"----"+obj.d);
		int x =10;
		int y=23;
		obj.value(x,y);
	}

	//callby Value
	public int value(int a, int b) {
		System.out.println(a+b);
		 a= 20;
		 b= 30;
		System.out.println(a+b);
		return a+b;
		
	}
	
	//callby reference // in C laguage we use pointers to call a method by reference , here it is possible normally.
	public void reference(CallbyValue_CallbyReference x) {
		int temp=c;  	//x.c=2
		c =d;		//x.c=8
		d=temp;		//x.d=2
		
	}
}
