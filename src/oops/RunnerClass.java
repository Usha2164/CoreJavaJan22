package oops;

public class RunnerClass {
	
	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.Name = "Sachin";
		emp1.EmployeeId = 1001;
		emp1.Salary = 25000;
		
		Employee emp2 = new Employee();
		emp2.Name = "Usha";
		emp2.EmployeeId = 2001;
		emp2.Salary = 30000;*/
		
		//Employee emp1 = new Employee("Sachin",1001,25000);
		//Employee emp2 = new Employee("Usha",2001,30000);
		
		//emp1.PrintName();
		//emp2.PrintName();
		
		Employee emp3 = new Employee("Prasad",8001,40000);
		Employee.ChangeCompanyName();
		
				
		Person per1 = new Person();
		ChildClass child1 = new ChildClass("Rahul",20,"Actor");
		child1.display();
		child1.print();
		
		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4, 6);
		obj.sum(5, 8, 10);
		
		ICICIBank bank1 = new ICICIBank();
		bank1.Creditcard();
		bank1.Welcome();
		
		EncapsulationExample obj10 = new EncapsulationExample();
		obj10.setName("Rohit");
		System.out.println(obj10.getName());
		
		
		
	}

}
