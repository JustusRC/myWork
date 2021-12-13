

public class myWork {

	public static void main(String[] args) {
		Employee e1 = new Employee("Jeff", 30000);
		Employee e2 = new Manager("Larry", 80000, "Sales");
		Employee e3 = new Executive("Jeff", 100000, "Regional VP");
		Manager m1 = new Manager ("Scott", 60000, "MKT");
		Executive ex1 = new Executive ("Emma", 1500000, "LATAM VP");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(m1);
		System.out.println(ex1);

	}

}
