package co.interleap.courses.tdd;


public class VowelCounter {
	
	public int vowelCounter(String string) {
		final String res= "(?i)[^aeioius]+";
		return string.replaceAll(res,"").length();
	}
}
