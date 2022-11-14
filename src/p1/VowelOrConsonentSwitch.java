package p1;

public class VowelOrConsonentSwitch {
	public static void main(String[] args) {
		char c='a';
		
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("is vowel");
			break;

		default:
			System.out.println("is consonent");
			break;
		}
	}



}
