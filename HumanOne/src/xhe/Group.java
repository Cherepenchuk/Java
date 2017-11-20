package xhe;

import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;
	Student student;
	private Student[] studentArray = new Student[10];

	public Group(int number) {
		super();
		this.number = number;
	}

	public Group() {
		super();
	}

	// search by lastName
	public Student search(String lastName) {
		for (Student student : studentArray) {
			if (student != null && student.getLastName().equals(lastName)) {
				return student;
			}
		}
		return null;
	}

	public void addStundent(Student student) throws MyException {
		if (student == null) { // проверка на то что входящий параметр не равен null
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				studentArray[i] = student;
				return;
			}
		}
		throw new MyException(student);
	}

	public void delStudent(int num) { // удаление студентов по номеру
		if (num >= 0 && num < studentArray.length) {
			studentArray[num] = null;
		} else {
			System.out.println("Incorrect number.");
		}
	}

	public void sortByParametr(int parametr) {

		if (parametr == 1) {// сортировка по возрастанию
			Arrays.sort(studentArray,
					(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
							: a.getAge() - b.getAge());
		}
		if (parametr == 2) {// сортировка по убыванию
			Arrays.sort(studentArray,
					(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
							: (-1 * (a.getAge() - b.getAge())));
		}
		if (parametr == 3) {// сортировка от а до я
			// Arrays.sort(studentArray,(a,b) -> a.getName().compareTo(b.getName()) );
			Arrays.sort(studentArray,
					(a, b) -> CheckNull.checkNull(a, b) != CheckNull.NOT_NULL ? CheckNull.checkNull(a, b)
							: a.getLastName().compareTo(b.getLastName()));
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(number).append(System.lineSeparator());
		int celNumber = 1;
		for (Student student : studentArray) {
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

	public Student[] validForVoen() {
		int i = 0;
		for (Student student : studentArray) {
			if (student != null && student.getAge() > 18 && student.getSex() == "male") {
				i += 1;
			}
		}
		Student[] validSt = new Student[i];
		int j = 0;
		for (Student student : validSt) {
			if (student != null && student.getAge() > 18 && student.getSex() == "male") {
				validSt[j++] = student;
			}
		}
		return validSt;
	}
}
