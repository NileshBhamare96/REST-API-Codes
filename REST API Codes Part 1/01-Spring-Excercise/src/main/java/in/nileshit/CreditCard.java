package in.nileshit;

public class CreditCard implements Ipayment {
	
	
	public CreditCard() {
		System.out.println("CreditCardPayement :: Constructor");
	}

	public String pay (double amount)
	{
		//CC logic
		
		return "Payment done through CreditCard" ;
	}

}
