package xhe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStackOne = new Stack ();
		Stack myStackTwo = new Stack ();
		
		//���������� ����� � �����
		for (int i=0; i <10; i++) myStackOne.push(i);
		for (int i=0; i<20; i++) myStackTwo.push(i);
		
		//������� ��� ����� �� �����
		System.out.println("���������� ����� myStackOne : ");
		for (int i=0; i<10; i++) 
			System.out.println(myStackOne.pop());
		
		System.out.println("���������� ����� myStackTwo : ");
		for (int i=0; i<10; i++)
			System.out.println(myStackTwo.pop());

	}

}
