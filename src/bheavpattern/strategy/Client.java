package bheavpattern.strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPayment bill = new BillPayment();
		CardPayment pmt = new CardPayment();
		
		bill.setStrgy(pmt);
		
		System.out.println(bill.makePayment(5000, "HDFC Card XXXX 4363"));
		
		CashPayment pmt2 = new CashPayment();
		bill.setStrgy(pmt2);
		
		System.out.println(bill.makePayment(3000, "At Central Mall"));
	}

}
