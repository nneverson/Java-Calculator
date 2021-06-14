package oopConcepts;

public class Student extends Person implements PersonInterface {

private int stud_id;
private String subject1;
private int sub1Grade;
private String subject2;
private int sub2Grade;
private String subject3;
private int sub3Grade;
private String major;



public Student(int stud_id, String subject1, int sub1Grade, String subject2, int sub2Grade, String subject3, int sub3Grade,String major, String fullName, int studentAge, char studentGender)
{
	super (fullName,studentAge,studentGender); //inheritance 
	
	
	this.stud_id = stud_id;
	this.subject1 = subject1;
	this.sub1Grade = sub1Grade;
	this.subject2 = subject2;
	this.sub2Grade = sub2Grade;
	this.subject3 = subject3;
	this.sub3Grade = sub3Grade;
	this.major = major;
	
			
}
//signature is the combination of the name of the method and the parameter list
public double calculate(int totalScore){
	
	double avg = ((this.sub1Grade+this.sub2Grade+this.sub3Grade)/totalScore);
	return avg;
}
@Override 
public void display()
{
	System.out.println(ORGANIZATION);
	System.out.println();
	super.display();
//	System.out.println("Student Name: "+ fullName);
	System.out.println("student id: " + stud_id);
//	System.out.println("Student Age: " + studentAge);
	//these lines are commented out because the parent (Person.java) is printing them from super.display()
//	System.out.println("Student Gender: " + studentGender);
	System.out.println("Class: " + subject1);
	System.out.println("Class: " + subject2);
	System.out.println("Class: " + subject3);
	System.out.println("Major: " + major);

}
} 


