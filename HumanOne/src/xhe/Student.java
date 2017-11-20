package xhe;

import java.io.Serializable;

public class Student extends Human implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int courseNumber;
	private int recordBookNumber;
	Human lastName;
	
	public Student(String name, String lastName, int age, String sex, int courseNumber, int recordBookNumber) {
		super(name, lastName, age, sex);
		this.courseNumber = courseNumber;
		this.recordBookNumber = recordBookNumber;
	}
	public Student(String name, String lastName, int age, String sex) {
		super(name, lastName, age, sex);
	}

	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public int getRecordBookNumber() {
		return recordBookNumber;
	}
	public void setRecordBookNumber(int recordBookNumber) {
		this.recordBookNumber = recordBookNumber;
	}
	public void inf() {
		System.out.println("Student " + super.toString()+ " courseNumber=" + courseNumber + ", recordBookNumber=" + recordBookNumber);
	}
	@Override
	public String toString() {
		return "Student " + super.toString()+ " courseNumber=" + courseNumber + ", recordBookNumber=" + recordBookNumber + "]";
	}
	
}

