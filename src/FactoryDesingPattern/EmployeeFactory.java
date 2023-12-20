package FactoryDesingPattern;

public class EmployeeFactory {
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("Application Dev")){
			return new ApplicationDev();
		}
		else if(empType.trim().equalsIgnoreCase("Web devloper")) {
			return new WebDev();
		}else {
			return null;
		}
	}
}
