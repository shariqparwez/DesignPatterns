package strupattern.decorator;

public class SocialNetWorkBanking extends FeatureDecorator {

	BankAccount account;
	
	
	public SocialNetWorkBanking(BankAccount account) {
		super(account);
		this.account = account;
	}


	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain() + 10000.00;
	}

}
