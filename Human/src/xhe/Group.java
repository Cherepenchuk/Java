package xhe;

public class Group {
	private int number;
	private Student[] studentArray = new Student [10];
	public Group(int number) {
		super();
		this.number = number;
	}
	public Group() {
		super();
	}
	public void addStundent (Student student) throws MyException {
			 for (int i=0; i<studentArray.length; i++) {
			if(studentArray[i]==null) {
				studentArray[i]=student;
				return;
			} 				
		}
		throw new MyException (student);	 
		//11 студент и собственное исключение 
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
