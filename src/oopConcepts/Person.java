package oopConcepts;

public class Person {

	private static int count=0;
	
	private String fullName;
	private int studentAge;
	private char studentGender;
	
	
	public Person()
	{
	
		count++;	
//count is a static variable
	}
	public Person(String name, int age, char gender) //constructor
	{
		fullName = name;
		studentAge= age;
		studentGender= gender;
		count++; //count represents the number of objects created
	}
	
	
	
	public void display()
	{
		System.out.println("Name: " + this.fullName);
		System.out.println("Student age: " + this.studentAge);
		System.out.println("Student gender: " + this.studentGender);
		
	}
//	public static void totalObjects()
//	{
//		System.out.println("total objects" + count); shows count
//	}
	}
	
	


