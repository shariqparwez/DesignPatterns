package structural.pattern.facade;
import java.util.HashMap;
import java.util.logging.Logger;
public class FacadeDetails {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	public HashMap<String, String> getDetails() {
		
		log.info("inside facadeDetails");
		
		HashMap<String, String> allDetails = new HashMap<>(10) ;
		
		allDetails.putAll(getFlightDetails());
				
		allDetails.putAll(getHotelDetails());
		
		return allDetails;
	}
	
	private HashMap<String, String> getFlightDetails() {
		
		FlightDetails flight1 = new FlightDetails();
		
		flight1.init();
		
		return flight1.getDetails();
	
	}
	
	private HashMap<String, String> getHotelDetails() {
		
		HotelDetails hotel1 = new HotelDetails();
		
		hotel1.init();
		
		return hotel1.getDetails();
	}
}
