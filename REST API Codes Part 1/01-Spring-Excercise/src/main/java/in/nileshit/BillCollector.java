package in.nileshit;

public class BillCollector {

	Ipayment payment;

	public BillCollector() {
	}

	public BillCollector(Ipayment payment) {

		System.out.println("BillCollector :: Parametrised Constructor");

		this.payment = payment;
	}

	public void setPayment(Ipayment payment) {
		System.out.println("setPayement()::Executed");
		this.payment = payment;
	}

	public void collectPayemet(double amount) {
		System.out.println("Injected ::  " + payment.getClass().getName());
		String status = payment.pay(amount);

		System.out.println(status);
	}

}
