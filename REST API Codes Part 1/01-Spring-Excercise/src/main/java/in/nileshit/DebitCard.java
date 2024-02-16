package in.nileshit;

public class DebitCard implements Ipayment {

	public DebitCard() {
		System.out.println("DebitCardPayement :: Constructor");
	}

	public String pay(double amount) {
		// DC logic

		return "Payment done through DebitCard";
	}

}
