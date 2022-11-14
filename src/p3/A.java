package p3;

import java.util.HashMap;

public class A {
public static void main(String[] args) {
	String s="kirannaik";
	char[] x = s.toCharArray();
	
	HashMap<Character, Integer> h= new HashMap<Character, Integer>();
	for (char i : x) {
		if (h.containsKey(i)) {
			h.put((char) i,h.get(i)+1);
		} else {
			h.put((char) i,1);
		}
	}
	System.out.println(h);
}
}
