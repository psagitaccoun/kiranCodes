package p1;

public class RemovingOfDuplicatesInSortedArray {
public static void main(String[] args) {
	int[] x= {1,8,8,14,14,15,21,21,25,26,26};
	int[] y=new int[x.length];
	int j=0;
	for (int i = 0; i < y.length-1; i++) {
		if (x[i]!=x[i+1]) {
			y[j]=x[i];
			j++;
		}
	}
	
	y[j]=x[x.length-1];
	
	for (int i : y) {
		System.out.print(" "+i);
	}
}
}
