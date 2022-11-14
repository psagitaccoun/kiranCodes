package p1;

public class Armstrong {
public static void main(String[] args) {
	int n=154;
	int oN=n;
	int sum=0;
	int r;
	while (n>0) {
		r=n%10;
		sum=sum+r*r*r;
		n=n/10;
	
	}
	if (oN==sum) {
		System.out.println("is A");
	} else {
		System.out.println("is not A");
	}
}
}
