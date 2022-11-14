package employee2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(new Employee(1,"sagar",2000));
		a.add(new Employee(2,"kiran",3000));
		a.add(new Employee(3,"anil",1000));
		
		for (Employee e : a) {
			e.printDetails();
		}
		
		
			List<Employee> c = a.stream().filter(e->e.getSalary()>1500).collect(Collectors.toList());
			for (Employee e : c) {
				e.printDetails();
			}
			
			
			List<Employee> c1 = a.stream().sorted().collect(Collectors.toList());
			for (Employee e : c1) {
				e.printDetails();
			}
	}
}
