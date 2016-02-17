package strupattern.proxy;

public class CalculateBeanImpl implements CalculateBean {

	@Override
	public double farenToCelsius(double faren) {
		// TODO Auto-generated method stub
		return (faren-32)*(5.0/9.0);
	}
	
}
