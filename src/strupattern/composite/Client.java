package strupattern.composite;

public class Client {

	public static void main(String[] args) {
		Store s1 = new Store(5000, "A");
		Store s2 = new Store(15000, "B");
		Store s3 = new Store(30000, "C");
		
		City newDelhi = new City("NewDelhi");
		
		State delhi = new State("Delhi");
		
		newDelhi.addLeaf(s1);
		newDelhi.addLeaf(s2);
		newDelhi.addLeaf(s3);
		//newDelhi.removeLeaf(s3);
		
		delhi.addLeaf(newDelhi);
		
		System.out.println("Total Collection " + delhi.getProfit());
	}

}
