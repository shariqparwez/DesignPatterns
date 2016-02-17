package crea.pattern.factory;

public abstract class LoanAccount {
	private double rateOfInterest;

	protected LoanAccount(double rateOfInterst) {
		this.rateOfInterest = rateOfInterst;
	}

	public abstract double calculateEMI(double loanAmount, double tenure);

	public double getRateOfInterest() {
		return rateOfInterest;
	}

}
