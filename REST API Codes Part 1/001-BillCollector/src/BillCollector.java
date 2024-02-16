

public class BillCollector {
	
	Ipayment payment ;
	
	public BillCollector(Ipayment payment)
	{
		this.payment = payment ;
	}
	
	
	public void setPayment(Ipayment payment)
	{
		this.payment = payment ;
	}
	
	public void payBill(double amount)
	{
		String status = payment.pay(amount);
		System.out.println(status);		
	}
}
