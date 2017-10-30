package xhe;

public class MyException extends Exception {
	private Student detail;
	MyException (Student student) {
		detail = student;
	}
	public String toString() {
		return "MyException [" + detail + " . Group is full]";
	}
}
