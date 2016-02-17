package crea.pattern.prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee org = new Employee(101,"Shariq");
		Employee proto = null;
		System.out.println("Original " + org);
		try{
			proto = (Employee) org.clone();
			proto.setEmployeeName("Mr: " +proto.getEmployeeName());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Original : " + org);
		System.out.println("Prototype : " + proto);
	}

}
