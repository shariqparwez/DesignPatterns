package crea.pattern.factory;

/**
 * 
 * @author sparwe
 *
 *         Sub Class 1 / Product - 1
 */
public class HousingLoan extends LoanAccount {
	protected HousingLoan(double rateIntrest) {
		super(rateIntrest);
	}

	@Override
	public double calculateEMI(double loanAmount, double tenure) {

		return (loanAmount * getRateOfInterest() * tenure);
	}

}
