package bheavpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String msg = null;
		if(o instanceof MealOrder){
			msg = (String) arg;
		}
		
		if(msg.equals("Accepted")){
			System.out.println("Hooray Order Accepted");
		}
		
		else if(msg.equals("Completed")){
			System.out.println("Congratulations! Your Order is Ready");
		}
		
		else if(msg.equals("Pending")){
			System.out.println("Wait until your order is being processed");
		}
	}

}
