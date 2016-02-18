package bheavpattern.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		// TODO Auto-generated method stub
		String msg = "Your Payment Request of INR." + amt + " By card " + description + " Received\n";
		StringBuffer buffer = new StringBuffer(msg);
		
		double proceFee = amt * 0.012;
		
		double total = proceFee + amt;
		buffer.append("Processing fee of Rs." + proceFee + "Is Chargeable\n");
		buffer.append("Net Amount Rs." + total);
		return buffer.toString();
	}

}
