package strupattern.adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountAdapter adapter = new BankAccountAdapter(50000, new LifeInsurance(600000));
		
		double totalDue = adapter.findTotalDue();
		
		System.out.println("Total Due := " + totalDue);
	}

}
