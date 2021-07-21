package co.interleap.courses.tdd;

public class Ride {

	   private int minutes;
	   private int distance;
	   private static final int FARE_PER_KM=10;
		private static final int FARE_PER_MINUTE=1;
	   
	   Ride(int distance, int minutes){
		   this.minutes=minutes;
		   this.distance=distance;
	   }
	   
	 
	   public int getTotalFare() {
		      if(distance>=0 && minutes>=0 ) {		       
			   return((distance*FARE_PER_KM)+(minutes*FARE_PER_MINUTE));
		      }
		      
		      return 0;
		}
}

