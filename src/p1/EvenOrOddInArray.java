package p1;

public class EvenOrOddInArray {
public static void main(String[] args) {
	int[] x= {10,11,12,13,14,15};
	
	for (int i = 0; i < x.length; i++) {
		if (x[i]%2==0) {
			System.out.println(x[i]+":is even");
		} else {
			System.out.println(x[i]+":is odd");
		}
	}
}
}
