package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {
	
	
	
	
	public int create(List<Ride> list) {
		int count =0;
		for(Ride ride: list) {
		
	    	 count+=ride.getTotalFare();			
		}
		
		
		return count;
	}
	
	

}
