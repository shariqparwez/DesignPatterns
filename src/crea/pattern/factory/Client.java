package crea.pattern.factory;

//import java.util.Calendar;

public class Client {

	// private static final String LoanType = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calendar cal = null;
		LoanAccount account = LoanFactory.getInstance();

		System.out.println("personal Loan EMI" + account.calculateEMI(200000.00, 2));
		System.out.println("Rate Interest" + account.getRateOfInterest());

		LoanAccount account2 = LoanFactory.getInstance(LoanType.HOUSINGLOAN);

		System.out.println("Housing  Loan EMI" + account2.calculateEMI(50000.00, 2));
		System.out.println("Rate Interest" + account2.getRateOfInterest());

	}

}
