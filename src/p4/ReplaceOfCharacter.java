package p4;

import java.util.Arrays;

public class ReplaceOfCharacter {
public static void main(String[] args) {
	String s1="abcr";
	String s2="dcba";
	if (s1.length()==s2.length()) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean r = Arrays.equals(c1, c2);
		if (r==true) {
			System.out.println("s1 and s2 are  anagram");
		} else {
			System.out.println("s1 and s2 are not anagram");
		}
		
	} else {
System.out.println("s1 and s2 are not anagram");
	}
	}
}