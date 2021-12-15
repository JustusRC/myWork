public class Employee {
	
	
			//Justus Contreras
			//P2.13
			//cs234
	
	//Variable Declaration
	private String name;
	private double salary;

	//Constructor
	public Employee(String name, double salary) {
		 this.name = name;
	     this.salary = salary;
	
	}
	//gets the name
	public String aName() {

		return name;

		}

	
		//Gets the salary
		public double aSalary() {

		return salary;

		}



		@Override
		//toString
		public String toString() {

		return "Name:" + aName() + ", Salary:" + aSalary();

		}

		}
