package javaCampDay3Homework;

public class Student extends User {
	private String firstName;
	private String lastName;
	private int userId;
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, int userId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	

}
