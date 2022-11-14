package p6;

public class Main {
public static void main(String[] args) {
	C c= new C();
	c.test1();
	
	System.out.println();
	
	D d=new D();
	d.test1();
	d.show();
	
	C c1= new D();
	
	System.out.println();
	
	c1.test1();
}
}
