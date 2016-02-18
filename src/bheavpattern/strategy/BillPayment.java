package bheavpattern.strategy;

public class BillPayment {

	PaymentStrategy strgy;

	public BillPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentStrategy getStrgy() {
		return strgy;
	}

	public void setStrgy(PaymentStrategy strgy) {
		this.strgy = strgy;
	}
	
	public String makePayment(double amount, String description) {
		return strgy.pay(amount, description);
	}
}
