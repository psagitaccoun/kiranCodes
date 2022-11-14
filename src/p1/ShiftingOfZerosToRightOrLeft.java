package p1;

public class ShiftingOfZerosToRightOrLeft {
public static void main(String[] args) {
	int[] x= {0,1,0,2,0,5,0,6,90,0};
	
	for (int j = 0; j < x.length-1; j++) {
		for (int i = 0; i < x.length-1; i++) {
			if (x[i]>x[i+1]) {
				int temp=x[i];
				x[i]=x[i+1];
				x[i+1]=temp;
			}
	}
	
	}
	for (int i = 0; i < x.length; i++) {
		System.out.print(" "+x[i]);
	}
}
}
