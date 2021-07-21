package co.interleap.courses.tdd;

public class StatementGenerator {
	
	private int distance;
	private int time;
	private static final int FARE_PER_KM=10;
	private static final int FARE_PER_MINUTE=1;
	StatementGenerator(int distance, int time){
		this.time=time;
		this.distance=distance;
		
	}
	
	public int create() {
		
		 if(distance< -1 || time< -1) {
			 return 0;
		 }
		
		return ((distance*FARE_PER_KM)+(time*FARE_PER_MINUTE));
	}

}
