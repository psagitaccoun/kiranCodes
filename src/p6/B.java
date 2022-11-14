package p6;

public class B {
public static void main(String[] args) {
	int n;
	int r;
	int sum=0;
	
	for (int i =100; i <=200; i++) {
		n=i;
		
		while (n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if (sum == i)
		{
			System.out.print(i + " ");
		}
		sum = 0;
	}
}
}
