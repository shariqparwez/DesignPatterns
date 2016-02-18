package strupattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Store implements Profitable {

	private double profit;
	private String storeName;
	
	public Store(double profit, String storeName){
		this.profit = profit;
		this.storeName = storeName;
	}
	
	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		return this.profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub

	}

}
