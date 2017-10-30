package xhe;

public class Student extends Human {
	private int courseNumber;
	private int recordBookNumber;
	public Student(String name, int age, String sex, int courseNumber, int recordBookNumber) {
		super(name, age, sex);
		this.courseNumber = courseNumber;
		this.recordBookNumber = recordBookNumber;
	}
	public Student(String name, int age, String sex) {
		super(name, age, sex);
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
