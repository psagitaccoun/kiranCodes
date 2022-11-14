package collection;

public class Car {
	    public String name;
	    public int miles;
	     
	    public Car(String name, int miles) {
	        this.name = name;
	        this.miles = miles;
	    }
	    
	    
	     
	    public String getName() {
			return name;
		}



		public int getMiles() {
			return miles;
		}



		public void printDetails() {
	        System.out.println(name + " travelled " + miles + " miles.");
	    }
	}
