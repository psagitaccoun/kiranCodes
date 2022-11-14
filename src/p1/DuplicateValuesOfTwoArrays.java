package p1;

public class DuplicateValuesOfTwoArrays {
	
	public static void main(String[] args) {
		int[] x= {10,11,12,13,14};
		int[] y= {13,14,15,16};

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i]==y[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}

}
