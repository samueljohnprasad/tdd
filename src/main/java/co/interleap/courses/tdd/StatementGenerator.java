package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {
	
	
	private static final int FARE_PER_KM=10;
	private static final int FARE_PER_MINUTE=1;
	
	public int create(List<Ride> list) {
		int count =0;
		for(Ride ride: list) {
		
	    	if(ride.getMinutes()<0 ||ride.getDistance() <0) {
				  continue;
			}
			
			count+=fare(ride);
			
		}
		
		
		//return 
		return count;
	}
	
	private int fare(Ride ride) {
		return ((ride.getDistance()*FARE_PER_KM)+(ride.getMinutes()*FARE_PER_MINUTE));
	}

}
