package xhe;

<<<<<<< HEAD:HumanOne/src/xhe/Student.java
import java.io.Serializable;

public class Student extends Human implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
=======
public class Student extends Human{
>>>>>>> 1bf253b4df5d38e88f5f6b7eb4927444a7ffabaa:Human/src/xhe/Student.java
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
<<<<<<< HEAD:HumanOne/src/xhe/Student.java
	
=======
//	public int compareTo (Object o) {//сортировка по фамилии
//		Student anotherStudent = (Student) o;
//		if (this.lastName.compareTo(anotherStudent.lastName) > 0 ) {
//			return 1;
//		}
//		if (this.lastName.compareTo(anotherStudent.lastName) < 0 ) {
//			return -1;
//		}
//		return 0;
//	}
>>>>>>> 1bf253b4df5d38e88f5f6b7eb4927444a7ffabaa:Human/src/xhe/Student.java
}

