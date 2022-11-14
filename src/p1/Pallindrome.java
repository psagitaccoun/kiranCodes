package p1;

public class Pallindrome {
public static void main(String[] args) {
	int n=12121;
	int oN=n;
	int r;
	int sum=0;
	
	while (n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	
	if (oN==sum) {
		System.out.println("is palindrme");
	} else {
		System.out.println("is not palindrme");
	}
}
}
