package xhe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Group group = new Group(1);
		try {
			Student studentOne = new Student("Maria", "Tuk", 18, "female", 2, 1111);
			Student studentTwo = new Student("Sasha", "Che", 20, "female", 3, 1122);
			Student studentThree = new Student("Vova", "Svoi", 19, "male", 2, 1123);
			Student studentFour = new Student("Ivan", "Dorn", 17, "male", 1, 2222);
			Student studentFive = new Student("Misha", "Cho", 18, "male", 2, 1125);
			Student studentSix = new Student("Alexey", "Abak", 19, "male", 2, 1126);
			Student studentSeven = new Student("Oleg", "Bedr", 18, "male", 1, 2232);
					
			group.addStundent(studentOne); // 1
			group.addStundent(studentTwo); // 2
			group.addStundent(studentThree); // 3
			group.addStundent(studentFour); // 4
			group.addStundent(studentFive); // 5
			group.addStundent(studentSix); // 6
			group.addStundent(studentSeven); // 7
			group.addStundent(studentFour); // 8
			group.addStundent(studentOne); // 9

			System.out.println(group);

			 group.delStudent(0);
			 System.out.println(group.search("Che"));
			 group.sortByParametr(3);
			 System.out.println(group);
			group.validForVoen();//

		} catch (MyException e) {
			System.out.println("Перехвачено исключение : " + e);
		}
		//SAVE
		File file = new File("group.txt");
		saveObject(group, file);
		Group groupOne = new Group(2);
		groupOne = (Group) loadObject(file);
		System.out.println(groupOne);	
		
	}

	public static void saveObject(Object obj, File file) {
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(obj);
		} catch (IOException e) {

		}
	}

	public static Object loadObject(File file) {
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return ois.readObject();
		} catch (Exception e) {
			return null;
		}
	}

}
