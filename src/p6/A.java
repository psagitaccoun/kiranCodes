package p6;

public class A {

	public static void main(String[] args) {
		int n, r, sum = 0;
		for (int i =100; i <= 200; i++)
		{
			n = i;
			while (n > 0)
			{
				r = n % 10;
				sum = sum * 10 + r;
				n = n / 10;
			}
			if (sum == i)
			{
				System.out.print(i + " ");
			}
			sum = 0;
		}
	}
}
