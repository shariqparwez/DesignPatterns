package crea.pattern.factory;

/**
 * 
 * @author sparwe
 *
 *         Sub Class 2 / Product - 2
 */
public class PersonalLoan extends LoanAccount {

	private double processingFees;

	protected PersonalLoan(double rateIntrest) {
		super(rateIntrest);
		this.processingFees = 2000;
	}

	@Override
	public double calculateEMI(double loanAmount, double tenure) {

		return (loanAmount * getRateOfInterest() * tenure) + processingFees;
	}

}
