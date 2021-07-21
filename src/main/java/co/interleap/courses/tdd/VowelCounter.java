package co.interleap.courses.tdd;

import java.util.HashMap;
import java.util.Map;

public class VowelCounter {
	
	public int vowelCounter(String string) {
		string= string.toLowerCase();
		 Map <Character,Integer> map = new HashMap<>();
		 map.put('a',0);
		 map.put('e',0);
		 map.put('i',0);
		 map.put('o',0);
		 map.put('u',0);
		 
		 int count=0;
		 for(char c: string.toCharArray()) {
			  if( map.containsKey(c)) {
				  ++count;
			  }
		 }
		 
		return count;
	}
}
