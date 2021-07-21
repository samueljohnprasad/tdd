package co.interleap.courses.tdd;

public class Ride {

	   private int minutes;
	   private int distance;
	   
	   Ride(int distance, int minutes){
		   this.minutes=minutes;
		   this.distance=distance;
	   }
	   
	   public int getMinutes() {
		   return this.minutes;
	   }
	   
	   public int getDistance() {
		   return this.distance;
	   }
}

