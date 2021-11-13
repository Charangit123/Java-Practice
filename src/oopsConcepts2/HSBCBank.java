package oopsConcepts2;

public class HSBCBank extends HistoryofDefaultors implements USBank, BrazilBank{

	//if a class is implementing any interface, then it is mandatory to override all the methods of interface
	//Overriding from USBank
	public void credit() {
		System.out.println("hsbc credit");
	}
	
	public void debit() {
		System.out.println("hsbc debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc transfermoney");
}
	//HSBCClass
	public void educationloan() {
		System.out.println("hsbc Education Loan");
		
	}
	
	public void carloan() {
		
		System.out.println("hsbc Carloan");
	}
	
	//Overriding of BrazilBank
	public void mutualfund() {
		System.out.println("hsbc Mutualfund");
	}

	public void updatedrules() {
		System.out.println("WORLDBANK udated rules");
		
	}
	
}
