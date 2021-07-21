package co.interleap.courses.tdd;

public class StatementGenerator {
	
	private int distance;
	private int time;
	StatementGenerator(int distance, int time){
		this.time=time;
		this.distance=distance;
		
	}
	
	public int statementGenerator() {
		
		 if(distance< -1 || time< -1) {
			 return 0;
		 }
		
		return ((distance*10)+(time*1));
	}

}
