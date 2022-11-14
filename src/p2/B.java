package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B {
public static void main(String[] args) {
	ArrayList<Employee> a=new ArrayList<Employee>();
	a.add(new Employee(1,"kiran",10000));
	a.add(new Employee(2,"sagar",20000));
	for (Employee e : a) {
		e.printDetails();
	}
	
	System.out.println("---------");
	List<Employee> c = a.stream().filter(e->e.getSalary()>15000).collect(Collectors.toList());
	for (Employee e : c) {
		e.printDetails();
	}
}
}
