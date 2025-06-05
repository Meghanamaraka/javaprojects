package xyz;

public class Student1 {
	private String name;
	private int rollNo;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String checkresult() {
	if(marks>=40) {
	return "pass";}
	else {
	return "fail";}
		
	}
	public void displayDetails() {
		System.out.println("Roll no"+ getRollNo());
		System.out.println("Name"+ getName());
		System.out.println("Marks"+getMarks());
		System.out.println("checkResults"+checkresult());
		
	}
	public static void main(String[] args) { 
		Student1 s1 = new Student1();
		s1.setMarks(10);
		s1.setName("preethi");
		s1.setRollNo(101);
		s1.displayDetails();
	
		
		

	}

}
