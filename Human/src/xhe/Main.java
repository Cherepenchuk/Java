package xhe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//		Human hm = new Human("Yura", 20, "male");
//		System.out.println(hm);
//		hm.inf();
		Student st = new Student ("Misha", 20,"male", 2, 1111);
//		System.out.println(st);
//		st.inf();
		
		Student st1 = new Student ("Vova", 19,"male", 2, 1112);
		Student st2 = new Student ("Masha", 18, "female", 1, 1113);
		Student st3 = new Student ("Ira", 19, "female", 1, 1114);
		Student st4 = new Student ("Gosha", 20, "male", 3, 1115);
		Student st5 = new Student ("Vika", 21, "female", 3, 1116);
		Group group = new Group (1);
		
		group.addStundent(st); //1
		group.addStundent(st1); //2
		group.addStundent(st2); //3
		group.addStundent(st3); //4
		group.addStundent(st4); //5
		group.addStundent(st5); //6
		group.addStundent(st3); //7
		group.addStundent(st5); //8
		group.addStundent(st1); //9
		group.addStundent(st); //10
		group.addStundent(st4); //11
		System.out.println(group);
		} catch (MyException e) {
			System.out.println("Перехвачено исключение : " + e);
		} 	

	}

}
