package xhe;

@FunctionalInterface
interface Func {
	public int get(int n);
} 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func func; //���������� ���������� ���� ����������
		
		func = A ::getStaticMethod; //������ �� ������������ �����
		System.out.println(func.get(8));
		
		A a = new A(); //�������� ���������� ������ ������������ ���������
						//����� ����� ���� ������� �� ����������� �����
		
		func = a::getMethod; //������ �� ������� �����
		System.out.println(func.get(8));
		
		func = n -> n*n; //������-�������,  "->" - �������� �����������
		//func = (int n) -> n*n;//����� ������� ��� , �� �� ����� ������ �� ��������� 
		System.out.println(func.get(5));
		
		func = n -> { //���� ����� ��������� ������� ���������
			int fact = 1;
			for(int i = 1; i<=n; i++) {
				fact *=i;
			}
			return fact;
		}; //";" - ����������� ����� �������� ���� ����������
		System.out.println(func.get(5)); // ����� 120 ????
	}

}
class A { //��� ����� ������ �� ���� ������ implements
	public static int getStaticMethod(int n) { //����������� �����
		return 3*n;
	}
	public int getMethod (int n) {//������� �����
		return 5*n;
	}
}
