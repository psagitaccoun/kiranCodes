package employee2;

import java.util.HashMap;

public class C {
	public static void main(String[] args) {
		int[] x= {4,5,5,6,6,7};
		
		HashMap<Integer, Integer> h= new HashMap<Integer, Integer>();
		
		for (int i : x) {
			if (h.containsKey(i)) {
				h.put(i,h.get(i)+1);
			} else {
				h.put(i,1);
			}
		}
		System.out.println(h);
	}
	
}


