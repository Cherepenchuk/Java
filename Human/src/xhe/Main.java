package xhe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//		Human hm = new Human("Yura", 20, "male");
//		System.out.println(hm);
//		hm.inf();
		Student studentOne = new Student("Maria", "Tuk", 18, "female", 2, 1111);
//		System.out.println(st);
//		st.inf();
		
		Student studentTwo = new Student ("Sasha", "Che", 20, "female", 3, 1122);
		Student studentThree = new Student ("Vova", "Svoi", 19, "male", 2, 1123);
		Student studentFour = new Student ("Ivan", "Dorn", 17, "male", 1, 2222);
		Student studentFive = new Student ("Misha", "Cho", 18, "male", 2, 1125);
		Student studentSix = new Student ("Alexey", "Abak", 19, "male", 2, 1126);
		Student studentSeven = new Student ("Oleg", "Bedr", 18, "male", 1, 2232);
		Group group = new Group (1);
		
		group.addStundent(studentOne); //1
		group.addStundent(studentTwo); //2
		group.addStundent(studentThree); //3
		group.addStundent(studentFour); //4
		group.addStundent(studentFive); //5
		group.addStundent(studentSix); //6
		group.addStundent(studentSeven); //7
		group.addStundent(studentFour); //8
		group.addStundent(studentOne); //9
//		group.addStundent(studentSix); //10
//		group.addStundent(studentSeven); //11
		
		System.out.println(group);
		System.out.println();
		group.delStudent(0);
		System.out.println(group);
//		group.compareTo(group); // ???
		} catch (MyException e) {
			System.out.println("Перехвачено исключение : " + e);
		} 	
		

	}

}
