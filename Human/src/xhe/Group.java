package xhe;

public class Group {
	private int number;
	Student student;
	private Student[] studentArray = new Student [10];
	
	public Group(int number) {
		super();
		this.number = number;
	}
	public Group() {
		super();
	}
	public void addStundent (Student student) throws MyException {
		if(studentArray == null) {	//проверка на то что входящий параметр не равен null
			throw new IllegalArgumentException("Null student");
		}
			 for (int i=0; i<studentArray.length; i++) {
			if(studentArray[i]==null) {
				studentArray[i]=student;
				return;
			} 				
		}
		throw new MyException (student);	 
	}
	public void delStudent (int num) { //удаление студентов по номеру 
		if(num>=0 && num<studentArray.length) {
		studentArray[num]=null;
		} else {
			System.out.println("Incorrect number.");
		}
	}	
	public int compareTo (Object o) {//сортировка по фамилии
		Student anotherStudent = (Student) o;
		if (student.lastName.compareTo(anotherStudent.lastName) > 0 ) {
			return 1;
		}
		if (student.lastName.compareTo(anotherStudent.lastName) < 0 ) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(number).append(System.lineSeparator());
		int celNumber = 1;
		for(Student student : studentArray) {
			sb.append(celNumber++).append(")");
			if (student == null) {
				sb.append("Free");
			} else {
				sb.append(student);
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
	
}
