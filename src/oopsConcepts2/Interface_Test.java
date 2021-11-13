package oopsConcepts2;

public class Interface_Test {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		//we cann't cahnge the min_bal value as it is static in nature
		
		HSBCBank h = new HSBCBank();
		
		h.carloan();
		h.credit();
		h.debit();
		h.educationloan();
		h.transferMoney();
		h.mutualfund();
		
		h.updatedrules(); // calling from WHO interface
		h.internbank(); // calling from static method of USBank
		
		h.defaultorslist();//callimg from extends class
		
		System.out.println("###################");
		//dynamic polymorphism 
		// child class OBJECT CAN BE referred by parent interface variable
		
		USBank u= new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();
		System.out.println("###################");
		
		u.updatedrules();// calling from WHO interface
		u.internbank();// calling from static method of USBank
		
		
		BrazilBank b = new HSBCBank();
		b.mutualfund();
		System.out.println("###################");
		
		USBank.ServicesofUS();

	}

}
