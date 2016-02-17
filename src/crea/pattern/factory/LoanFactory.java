package crea.pattern.factory;

/**
 * 
 * @author sparwe
 *
 *         Facrory Class with a static method to create Instance of subclass
 */

public class LoanFactory {
	public static LoanAccount getInstance() {

		return getLoanAccount(LoanType.PERSONALLOAN);
	}

	public static LoanAccount getInstance(LoanType type) {

		return getLoanAccount(type);
	}

	private static LoanAccount getLoanAccount(LoanType type) {
		LoanAccount account = null;

		switch (type) {
		case PERSONALLOAN:
			account = new PersonalLoan(12.00);
			break;
		case HOUSINGLOAN:
			account = new HousingLoan(13.00);
			break;
		default:
			account = null;
		}
		return account;
	}

}
