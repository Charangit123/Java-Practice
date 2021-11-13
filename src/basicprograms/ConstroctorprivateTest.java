package basicprograms;

public class ConstroctorprivateTest {

	public static void main(String[] args) {
//		ConstructorPrivate obj= new ConstructorPrivate();// not able to call beacuase of private access modifier
		
		int i =ConstructorPrivate.test();
		System.out.println(i);
		
		//static blocks are orinted if we call any variable or method from the same class
		
	}

}
