package strupattern.decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineBanking acc = new OnlineBanking(new SavingsAccount());
		System.out.println(acc.balanceToMaintain());
		
		BankAccount acc2 = new SocialNetWorkBanking(new OnlineBanking(new SavingsAccount()));
		System.out.println(acc2.balanceToMaintain());
	}

}
