package FactoryDesingPattern;

public class Client {
	public static void main(String[] args) {
		Employee employee=EmployeeFactory.getEmployee("Application Dev");
		System.out.println("salary : "+employee.getSalary());
		
		Employee employees=EmployeeFactory.getEmployee("Web devloper");
		System.out.println("salary: "+employees.getSalary());
	}
}
