package strupattern.composite;

import java.util.ArrayList;
import java.util.List;

public class State implements Profitable {

	private String stateName;
	private List<Profitable> cities;
	
	public State(String stateName) {
		super();
		this.stateName = stateName;
		cities = new ArrayList<Profitable>();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		double profit = 0;
		for(Profitable obj:cities){
			profit = profit + obj.getProfit();
		}
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
		if(child instanceof City){
			cities.add(child);
		}
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub
		if(child instanceof City){
			cities.remove(child);
		}

	}

}
