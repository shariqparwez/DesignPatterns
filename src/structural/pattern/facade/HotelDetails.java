package structural.pattern.facade;
import java.util.HashMap;
import java.util.logging.Logger;
public class HotelDetails {
	Logger log = Logger.getLogger(this.getClass().getName());
	
	HashMap<String , String> hotels = new HashMap<>(4, 3);
	
	public void init() {
		
		hotels.put("H101", "Hotel 1");
		hotels.put("H102", "Hotel 2");
		hotels.put("H103", "Hotel 3");
	}
	
	public HashMap<String, String> getDetails() {
		
		log.info("In hotelDetails");
		
		
		return hotels;
	}
}
