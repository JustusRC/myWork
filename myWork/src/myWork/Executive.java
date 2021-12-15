public class Executive extends Manager {
	
	//Justus Contreras
	//P2.13
	//cs234

	//Constructor
	public Executive(String name, double salary, String department) {
		super(name, salary, department);
		
	}

	//toString
	public String toString() {

		return "Name:" + aName() + ", Salary:" + aSalary() + ", Department: "+aDepartment();

		}
	
}
