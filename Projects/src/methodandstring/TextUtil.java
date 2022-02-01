package methodandstring;

import java.util.StringTokenizer;

public class TextUtil {

	public static String uppercase(String str) {
		return str.toUpperCase();
	}
	
	public static String lowercase(String str) {
		return str.toLowerCase();
	}
	
	public static String sentencecase(String str) {
		// captial to first letter only and rest is lower case
//		StringBuffer sb = new StringBuffer();
//	    for(int i=0; i<str.length();i++) {
//	    	if(i==0) {
//	    		Character c = str.charAt(i);
//	    		sb.append(c.toUpperCase(c));
//	    	}
//	    	sb.append(str.charAt(i));
//	    }
		str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		//return sb.toString();
		return str;
	}
	
	public static String titlecase(String str) {
	    StringTokenizer st = new StringTokenizer(str);
	    String h = "";
	    while(st.hasMoreTokens()) {
	    	String s = st.nextToken();
	    	s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	    	h = h + " " + s;
	    }
		return h;
	}
	
	public static int wordcase(String str) {
	    StringTokenizer st = new StringTokenizer(str);
	    int c = st.countTokens();
		return c;
	}
	
	public static int charcase(String str) {
		return str.length();
	}
	
	public static String digitcase(String str) {
		String st = "";
		for(int i=0; i<str.length();i++) {
			Character c = str.charAt(i);
			if(c.isDigit(str.charAt(i))) {
				st = st + " " + str.charAt(i);
			}
		}
		return st;
	}
}
