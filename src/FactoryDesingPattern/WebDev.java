package FactoryDesingPattern;

public class WebDev implements Employee{

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		System.out.println("getting salary of web devloper");
		return 60000;
	}

}
