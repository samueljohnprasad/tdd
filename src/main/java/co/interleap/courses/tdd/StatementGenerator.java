package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {
	
	
	private static final int FARE_PER_KM=10;
	private static final int FARE_PER_MINUTE=1;
	
	public int create(List<Ride> list) {
		int count =0;
		for(Ride ride: list) {
			int distance=ride.getDistance();
			int minutes=ride.getMinutes();
			
			if(distance<0 ||minutes <0) {
				  continue;
			}
			
			count+=((distance*FARE_PER_KM)+(minutes*FARE_PER_MINUTE));
			
		}
		
		
		//return 
		return count;
	}

}
