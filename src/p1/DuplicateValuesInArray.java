package p1;

public class DuplicateValuesInArray {
public static void main(String[] args) {
	int[] x= {10,11,12,10,12,13,14};
	
	
	for (int i = 0; i < x.length; i++) {
		for (int j =i+1; j < x.length; j++) {
			if (x[i]==x[j]) {
				System.out.println(x[i]);
			}
		}
	}
	
}
}
