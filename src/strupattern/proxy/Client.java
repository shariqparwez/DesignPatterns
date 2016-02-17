package strupattern.proxy;

public class Client {
	
	public static void print(CalculateBean bean){
		double cel = bean.farenToCelsius(100);
		System.out.println("Temperature " + cel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateBeanProxy proxy = new CalculateBeanProxy();
		
		print(proxy);
	}

}
