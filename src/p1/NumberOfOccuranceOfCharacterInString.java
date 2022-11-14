package p1;

public class NumberOfOccuranceOfCharacterInString {
public static void main(String[] args) {
	String s="kirannaikk";
	
	int l1 = s.length();
	int l2 = s.replace("k", "").length();
	System.out.println("number of occurance of k:"+(l1-l2));
}
}
