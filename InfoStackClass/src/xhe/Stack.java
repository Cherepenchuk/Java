package xhe;
// � ���� ������ ������������ ������������� ����, � �������
//����� ������� �� 10 ������������� �������� 
public class Stack {
	int[] stck = new int [10];
	int tos;
	//������
	Stack() { //������������� ������� �����, "-1" �������� ������ ����
		tos = -1;
	}
	void push (int item) {//���������� ������� � �����
		if (tos==9)
			System.out.println("���� ��������.");
		else
			stck[++tos] = item;
	}
	int pop () {//������� ������� �� �����
		if(tos<0) {
			System.out.println("���� �� ��������.");
			return 0;
		}
		else 
			return stck[tos--];
	}
}
