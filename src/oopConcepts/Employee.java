package oopConcepts;

public class Employee extends Person {
	private int emp_id;
	private double emp_salary;
	private String emp_position;
	
	
	
	public Employee(int id, String name, int age, char gender, double salary, String position)
	{
		super(name, age, gender);
		this.emp_id = id;
		this.emp_salary = salary;
		this.emp_position = position;
	}
	public void display()
	{
		System.out.println("Id : " + this.emp_id);
		super.display();
		
		System.out.println("Salary: " + this.emp_salary);
		System.out.println("Position : " + this.emp_position);
	}
}
