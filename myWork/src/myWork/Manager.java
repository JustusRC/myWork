public class Manager extends Employee {
	
	
	//Justus Contreras
	//P2.13
	//cs234
	
	//Variable declaration
	private String department;
	//Constructor
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	//Gets the department
	public String aDepartment() {

		return department;

		}
	
	//toString
	public String toString() {

		return "Name:" + aName() + ", Salary:" + aSalary() + ", Department: "+aDepartment();

		}

}
