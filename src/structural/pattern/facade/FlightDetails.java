package structural.pattern.facade;
import java.util.HashMap;
import java.util.logging.Logger;
public class FlightDetails {
	Logger log = Logger.getLogger(this.getClass().getName());
	
	HashMap<String, String> flights = new HashMap<>(4, 3);
		
	public FlightDetails() {
		
		super();
		
	}

	public void init() {
		
		flights.put("14K", "IGI - MNGL (JetAirWays)");
		flights.put("34K", "MNGL - IGI (Indigo)");
		flights.put("24K", "IGI - CST (AirIndia)");
	}

	public HashMap<String,String> getDetails() {
	
		log.info("In flightDetails");
		
		return flights;
		
	}
}
