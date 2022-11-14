package emplyee1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
	ArrayList<Employee> a= new ArrayList<Employee>();
	a.add(new Employee(1,"kiran",10000));
	a.add(new Employee(2,"sagar",20000));
	a.add(new Employee(3,"praveen",30000));
	a.add(new Employee(4,"laxman",40000));
	
	for (Employee e : a) {
		e.printDetails();
	}
	System.out.println("Employers above 25000");
	List<Employee> c = a.stream().filter(e->e.getSalary()>25000).collect(Collectors.toList());
	for (Employee e : c) {
		e.printDetails();
	}
}
}
