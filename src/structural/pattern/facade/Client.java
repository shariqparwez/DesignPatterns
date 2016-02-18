package structural.pattern.facade;
import java.util.logging.Logger;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger("Main");
		FacadeDetails facade = new FacadeDetails();
		log.info(""+facade.getDetails().toString());
	}

}
