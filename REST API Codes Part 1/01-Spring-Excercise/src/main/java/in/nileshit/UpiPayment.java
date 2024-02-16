package in.nileshit;

public class UpiPayment implements Ipayment {

	public UpiPayment() {
		System.out.println("UPIPayement :: Constructor");
	}

	public String pay(double amount) {
		// UPI logic

		return "Payment done through UPI";
	}

}
