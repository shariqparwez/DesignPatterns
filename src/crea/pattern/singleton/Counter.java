package crea.pattern.singleton;

public class Counter {
	private static Counter count;
	private static int cnt;
	
	private Counter(){
		//count = new Counter();
		cnt = 100;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return cnt;
	}

	public synchronized static Counter getInstance(){
		if(count==null){
			count = new Counter();
		}
		cnt++;
		return count;
	}
}
