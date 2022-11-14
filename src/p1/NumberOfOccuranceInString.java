package p1;

import java.util.HashMap;

public class NumberOfOccuranceInString {
public static void main(String[] args) {
	String s="kirannaikacademy";
	char[] d = s.toCharArray();
	
	HashMap<Character, Integer> h=new HashMap<Character, Integer>();
	for (char c : d) {
		if (h.containsKey(c)) {
			h.put(c,h.get(c)+1);
		} else {
			h.put(c,1);
		}
	}
	System.out.println(h);
}
}
