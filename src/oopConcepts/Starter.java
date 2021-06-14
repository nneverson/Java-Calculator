package oopConcepts;

import java.util.Scanner;

public class Starter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
//		String fullName;
	
//Person student1 = new Person("Angelica Pickles", 5, 'F');
//Person student2 = new Person("Susie Carmichael", 6,'F');
//Person student3 = new Person("Tommie Pickles",3, 'M');

Employee emp1 = new Employee(101, "Rachel Smith", 26, 'F', 30435.78, "Computer Science TA ");
emp1.display();
System.out.println();
//
//Employee emp2 = new Employee(102, "Neely Neverson", 28, 'F', 80504.78);
//emp2.display();

Student stu1 = new Student(001, "Calculus",95 , "Philosophy",100 ,"Computer Science",98,"General Studies", "Kimberly Ann", 19, 'F');
stu1.display();
double avg = stu1.calculate(3);
System.out.println("Average: " + String.format("%.3f", avg));
System.out.println();

//student3.display();
//student1.display();
//student2.display();

//Person1 p1 = new Person1();
while (true) {
Person person = null;

System.out.println("Enter full name: ");
String fullName =scan.nextLine();

System.out.println("Enter age: ");
int age =scan.nextInt();

System.out.println("Enter gender:");
char gender = scan.next().charAt(0);
System.out.println();
scan.nextLine();

System.out.println("Type an occupation: 'student' or 'employee'. ");
String option = scan.nextLine();

if(option.equalsIgnoreCase("student")) {
	System.out.println("Enter the student's first class: ");
	String subject1 = scan.nextLine();
System.out.println("Enter the student's second class");
String subject2 = scan.nextLine();
System.out.println("Enter the student's third class");
String subject3 = scan.nextLine();
System.out.println("Enter the student's major: ");
String major = scan.nextLine();
person = new Student(2, subject1,56 ,subject2, 78, subject3, 90, major, fullName, age, gender);
} else {
	System.out.println("Enter the employee's salary: ");
	double salary = scan.nextDouble();
	scan.nextLine();
	System.out.println("Enter the employee's position: ");
	String position = scan.nextLine();
	person = new Employee(1, fullName, age, gender, salary, position);
}
person.display();
System.out.println("do you want to continue? (Y/N)");
char shouldContinue = scan.nextLine().charAt(0);
if(Character.toLowerCase(shouldContinue) == 'n') {break;}
}
	}
}




