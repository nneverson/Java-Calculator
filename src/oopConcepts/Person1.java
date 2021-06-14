 package oopConcepts;



public class Person1 {
	static int count=0;
	private String fullName;
	private int personAge;
	private char personGender;
	
	
//	System.out.println("Enter first number: ");
//	num1 = scan.nextInt();
	
	public String getfullName() {
		return fullName;
	}
	
	public void setfullName(String fullName) {
	this.fullName = fullName;
}
	public int getpersonAge() {
		return personAge;
	}
	public void setpersonAge(int personAge) {
		this.personAge = personAge;
	}
	public char getpersonGender() {
		return personGender;
	}
	public void setpersonGender(char personGender) {
		this.personGender= personGender;
	}

	@Override
	public String toString() {
		return "Person1 [fullName=" + fullName + ", personAge=" + personAge + ", personGender=" + personGender + "]";
	}
	
}
