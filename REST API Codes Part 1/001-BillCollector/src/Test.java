
public class Test {
	
	public static void main(String args[])
	{
		// Constructor Injection
		BillCollector bc = new BillCollector(new CreditCard() );
		bc.payBill(1500.00);
		
		
		// Setter Injection
		BillCollector bc1 = new BillCollector(new DebitCard() );
		bc1.payBill(1400.00);
	}

}
