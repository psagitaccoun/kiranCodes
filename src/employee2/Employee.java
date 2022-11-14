package employee2;

public class Employee {
	
	private int id;
	
	private String name;
	
	private long salary;

	
	Employee(int id,String name,long salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public long getSalary() {
		return salary;
	}
	
	public void printDetails() {
		System.out.println(id+" "+name+" "+salary);
	}
	

}
